package com.example.dao;
 
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.ibatis.SqlMapClientTemplate;
import org.springframework.stereotype.Repository;

import com.example.dto.UserDto;
 
@Repository
@SuppressWarnings("unchecked")   // �������� �����Ϸ��� ��� ����
public class MainDaoImpl implements MainDao{

	@Autowired
	private SqlMapClientTemplate sqlMapClientTemplate;
	

	@Override
	public List<UserDto> getUserInfo() {
		List<UserDto> lists = sqlMapClientTemplate.queryForList("common.getList");
		return lists;
	}

}



