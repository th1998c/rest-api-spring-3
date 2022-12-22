package com.th.apispring3.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.th.apispring3.model.record.DoctorRegisterForm;
import com.th.apispring3.service.DoctorService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/doctor")
@RequiredArgsConstructor(onConstructor_ = {@Autowired})
public class DoctorController {
	
	private final DoctorService doctorService;
	
	@PostMapping
	public void Register(@RequestBody DoctorRegisterForm form) {
		doctorService.Register(form);
	}
	
}
