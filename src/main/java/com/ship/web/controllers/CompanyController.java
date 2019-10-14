package com.ship.web.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.ship.web.services.CompanyService;

@Controller
public class CompanyController {
	private static final Logger logger = LoggerFactory.getLogger(CompanyController.class);
	@Autowired CompanyService companyService;

}
