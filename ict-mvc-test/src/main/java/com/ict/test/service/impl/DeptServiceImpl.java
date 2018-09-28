package com.ict.test.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ict.test.dao.DeptDAO;
import com.ict.test.service.DeptService;
import com.ict.test.vo.Dept;

@Service
public class DeptServiceImpl implements DeptService{
	@Autowired
	private DeptDAO ddao;
	
	@Override
	public List<Dept> getDepts() {
		return ddao.selectDepts();
	}

}
