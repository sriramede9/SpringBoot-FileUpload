package com.example.UploadImage.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/users")
public class UserController {

	@GetMapping("/get")
//	@RequestMapping(path = "/get",method = RequestMethod.GET)
	public String getUsers() { 
		return "test";
	}
} 
 