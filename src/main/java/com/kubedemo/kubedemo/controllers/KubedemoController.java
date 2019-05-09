package com.kubedemo.kubedemo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kubedemo.kubedemo.entity.KubeDemoEntity;
import com.kubedemo.kubedemo.repository.KubeDemoRepo;

@RestController
@RequestMapping("/kube")
public class KubedemoController {

	@Autowired
	KubeDemoRepo kubeDemoRepo;

	@RequestMapping("/hello")
	public String kubedemo() {
		KubeDemoEntity name = (KubeDemoEntity) kubeDemoRepo.findAll();
		return "hello" + name.getName();
	}
}
