package com.ict.test.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ict.test.dao.DeptDAO;
import com.ict.test.vo.Dept;

@Repository
public class DeptDAOImpl implements DeptDAO{

	@Autowired
	private SqlSession ss;
	
	@Override
	public List<Dept> selectDepts() {
		return ss.selectList("DEPT.selectDept");
	}

}
