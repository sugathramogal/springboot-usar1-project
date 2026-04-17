package com.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.user;
@RestController
public class UserController {

		@GetMapping("/userlogin")
		public user Userdata() {
			return new user(151,"Sugathra","Developer","Plumsoft Solution");
		}
}
