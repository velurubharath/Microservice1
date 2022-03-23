package com.learn4u.microservice1;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class PolicyController {

	
	@Autowired
	PolicyBean policy;
	
	AtomicLong id = new AtomicLong();
	
	@GetMapping("/api/greeting")
	public PolicyBean getInfo(@RequestParam(value="name") String name) {
		
		policy.setId(id.incrementAndGet());
		policy.setMessage("Welcome to our page "+name);
		
		return policy;
	}
}
