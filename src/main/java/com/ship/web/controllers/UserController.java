package com.ship.web.controllers;
import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ship.web.domains.UserDTO;
import com.ship.web.mappers.UserMapper;
import com.ship.web.serviceimpls.UserServiceImpl;
@Controller
@RequestMapping("/user/*")
public class UserController {
	private static final Logger logger = LoggerFactory.getLogger(UserController.class);
	@Autowired UserDTO user;
	@Autowired UserServiceImpl userService;
	@Autowired UserMapper userMapper;
	
 	@GetMapping("/count")
	public String count(Model model) {
		return "index";
	}
	@GetMapping("/info")
	public String findUserByUid(@RequestParam("uid") String uid,
			@RequestParam("upw") String upw) {
		return "index";
	}
	@PostMapping("/join")
	public @ResponseBody Map<?,?> join(@RequestBody UserDTO param) {
		logger.info("ajax1가 보낸 아이디 비번{}",param.getUid()+","+param.getUpw()+","+param.getUname());
		HashMap<String,String> map = new HashMap<>();
		map.put("uid", param.getUid());
		map.put("upw", param.getUpw());
		map.put("uname",param.getUname());
		userService.join(param);
		logger.info("map1에 담긴 아이디와 비번{}", map.get("uid")+", "+map.get("upw")+","+map.get("uname"));
		return map;
	}
	@PostMapping("/login")
	public @ResponseBody UserDTO login(@RequestBody UserDTO param) {
		logger.info("ajax2가 보낸 아이디 비번{}",param.getUid()+","+param.getUpw());
		user.setUid(param.getUid());
		user.setUpw(param.getUpw());
		user = userService.login(param);
		logger.info("map2에 담긴 사용자 정보{}", user.toString());
		return user;
	}

}
