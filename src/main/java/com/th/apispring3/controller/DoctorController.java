package com.th.apispring3.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.th.apispring3.model.record.DoctorRegisterForm;

@RestController
@RequestMapping("/doctor")
public class DoctorController {
	
	@PostMapping
	public void Register(@RequestBody DoctorRegisterForm form) {
		System.out.println(form);
	}
	
}
