package com.workas.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ProductController {

	@RequestMapping(value = { "/product", "/pro" }, method = RequestMethod.GET)
	public String product( @RequestParam String id ) {
		System.out.println("Pull id : " + id);
		return "product";
	}
	
}
