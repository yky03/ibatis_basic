package com.example.controller;
 
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.dto.UserDto;
import com.example.service.MainService;
 
/**
 * Handles requests for the application home page.
 */
@Controller
public class MainController {
    
	@Autowired
	private MainService service;

	@RequestMapping("/getUser.do")
	public String doGetUser(ModelMap map){
		List<UserDto> lists = service.getUserInfo();
		map.addAttribute("lists", lists);
		return "userinfo";

	} 

    
}


