package com.wzh.demo.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import com.wzh.demo.dao.UserDao;
import com.wzh.demo.domain.UserBean;
import com.wzh.demo.mapper.UserMapper;

@Repository("userDao")
public class UserDaoImpl implements UserDao{
	
	@Resource
	private UserMapper userMapper;

	@Override
	public List<UserBean> selectUserByName(String name) {
		
		return userMapper.selectUserByName(name);
	}

}