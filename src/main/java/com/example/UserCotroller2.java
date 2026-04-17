package com.example;

import com.example.user;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/api")
public class UserCotroller2 {
	//second type
	@GetMapping("/userlogin2")
	@ResponseBody
	public user userdata() {
		return new user(151, "Sugathra", "Developer", "Plumsoft");
	}
	//third type
	@GetMapping("/userlogin3")
	public String userdata2(Model model) {
		user User=new user(150, "Siva", "Developer", "Plumsoft");
		model.addAttribute("usar", User);
		return "usertable";
	}
	
	@PostMapping("/userlogin4")
	public String Postdata(@RequestParam int id,
						@RequestParam String name,
						@RequestParam String role,
						@RequestParam String company,Model model) {
		user userObj = new user(id, name, role, company);

	    model.addAttribute("user", userObj);;
		return "postedtable";
		
	}
}
