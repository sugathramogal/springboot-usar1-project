package com.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class controller2 {
	@GetMapping("/hello2")
    public int Hello2() {
		return 7+11;
	} 
}
