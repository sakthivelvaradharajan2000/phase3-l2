package com.project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
	@Autowired
	MyRepository repo;
	@PostMapping(value="/upload")
	public String get(@RequestParam("id") int id, @RequestParam("name") String name, @RequestParam("feedback") String feedback) {
		feedback fb = new feedback(id, name, feedback);
		repo.save(fb);
		return "Added successfully!";
	}
}
