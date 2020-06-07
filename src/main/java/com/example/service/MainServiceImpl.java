package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.MainDao;
import com.example.dto.UserDto;

@Service
public class MainServiceImpl implements MainService{
	
	@Autowired
	private MainDao dao;

	@Override
	public List<UserDto> getUserInfo() {
		List<UserDto> lists = dao.getUserInfo();
		return lists;
	}
} 


