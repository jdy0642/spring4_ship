package com.company.web.commands;

import javax.servlet.http.HttpServletRequest;

import com.company.web.enums.Action;


public class Commander{
	 public static Command direct(HttpServletRequest request) {
		 Command cmd = null;
		 try {
			switch (Action.valueOf(request.getParameter("action").toUpperCase())) {
			case CREATE:
				cmd = null; break;
			case LOGIN:
				cmd = null; break;
			case MOVE:
				cmd = null; break;
			default:
				break;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return cmd;
	 }
		
}
