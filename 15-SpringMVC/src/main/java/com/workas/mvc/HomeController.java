package com.workas.mvc;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import props.Util;


@Controller
public class HomeController {
	
	List<String> ls = new ArrayList<String>();
	Util ut = new Util();
	
	public HomeController() {
		System.out.println(" HomeController Call()");
	}
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Model model, Random rd) {
		ls.add("ali");
		model.addAttribute("data", "Merhaba Spring " + rd.nextInt(100));
		System.out.println(ls);
		model.addAttribute("ls", ut.dataResult());
		return "home";
	}
	
	
	// userAdd
	@RequestMapping(value = "/addUser", method = RequestMethod.POST)
	public String addUser(
			@RequestParam String userName, 
			@RequestParam String userSurname) {
		System.out.println("name : " + userName + " surname : " + userSurname);
		return "redirect:/";
	}
	
	
}
