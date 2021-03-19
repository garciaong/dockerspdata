package com.garcia.docker.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/data")
public class DataController {

	private static final Logger log = LoggerFactory.getLogger(DataController.class);

	@GetMapping("/about")
	public String getAbout() {
		log.info("Endpoint call:api/data/about");
		return "This is Spring Boot 2 API from Data Layer";
	}
}
