package com.ship.web.controllers;
import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ship.web.domains.UserDTO;
@Controller
@RequestMapping("/user/*")
public class UserController {
	private static final Logger logger = LoggerFactory.getLogger(UserController.class);
	
	@GetMapping("/count/")
	public String count(Model model) {
		return "index";
	}
	@GetMapping("/info")
	public String findUserByUid(@RequestParam("uid") String uid,
			@RequestParam("upw") String upw) {
		//
		return "index";
	}
	@PostMapping("/join")
	public @ResponseBody Map<?,?> join(@RequestBody UserDTO user) {
		Map<String,String> map = new HashMap<>();
		logger.info("ajax가 보낸 아이디 비번{}",user.getuId()+","+user.getuPw());
		map.put("uId", user.getuId());
		map.put("uPw", user.getuPw());
		logger.info("map에 담긴 아이디와 비번{}", map.get("uId")+", "+map.get("uPw"));
		return map;
	}

}
