package com.ship.web.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ship.web.serviceimpls.UserServiceImpl;


@Controller
@RequestMapping("/user/*")
public class UserController {
	private static final Logger logger = LoggerFactory.getLogger(UserController.class);
	@Autowired UserServiceImpl userService;
	
	@GetMapping("/count/")
	public String count(Model model) {
		int count = userService.countUser();
		model.addAttribute("count", count );
		return "index";
	}
	@GetMapping("/info")
	public String findUserByUid(@RequestParam("uid") String uid,
			@RequestParam("upw") String upw) {
		//
		return "index";
	}

}
