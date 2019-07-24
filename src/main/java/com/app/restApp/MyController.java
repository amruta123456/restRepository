package com.app.restApp;
import java.util.HashMap; 
import java.util.Map; 
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {
	HashMap<String,String> hm = new HashMap<>();
	@GetMapping("/welcome")
	@ResponseBody
	public String sayWelcome() {
		return "welcome to my world";
	}
	

	@PostMapping("/loginvalid")
	//@ResponseBody
	public String loginvalid(@RequestParam("uname")String name,@RequestParam("pwd")String password) {
		String uname = hm.get("uname");
		String pass = hm.get("pass");
		if(uname.equals(name)&& password.equals(pass))
			return "success";
		return "fail";
	
	}
	
	@PostMapping("/registervalid")
	public String registervalid(@RequestParam("uname")String name,@RequestParam("pwd")String password) {
		
		hm.put("uname", password);
		hm.put("pass", password);
		return "login";
	
	}
	@GetMapping("/login")
	//@ResponseBody
	public String login() {
		
		
		return "login";
	}
	
	@GetMapping("/")
	//@ResponseBody
	public String register() {
		
		
		return "register";
	}
	
}
