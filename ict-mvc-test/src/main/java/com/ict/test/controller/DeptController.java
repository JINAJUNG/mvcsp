package com.ict.test.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ict.test.service.DeptService;

@Controller
public class DeptController {
	@Autowired
	private DeptService ds;

	@RequestMapping(value="/depts", method=RequestMethod.GET)
	public String getDepts(Model m) {
		m.addAttribute("dList",ds.getDepts());
		return "dept/deptList";
	}
	
}
