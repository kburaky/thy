package com.works.admin;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import util.Util;

@Controller
@RequestMapping("/admin")
public class DashboardController {

	@RequestMapping(value = "/dashboard", method = RequestMethod.GET)
	public String dashBoard( HttpServletRequest req ) {
		return Util.control(req, "dashboard");
	}
	
	
}