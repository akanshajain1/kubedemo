package com.kubedemo.kubedemo.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/kube")
public class KubedemoController {

	
	@RequestMapping("/hello")
	public String kubedemo() {
		
		return "hello mindtree";
	}
}
