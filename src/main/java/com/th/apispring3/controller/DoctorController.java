package com.th.apispring3.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.th.apispring3.model.record.DoctorRecord;
import com.th.apispring3.model.record.DoctorRegisterForm;
import com.th.apispring3.model.record.DoctorUpdateForm;
import com.th.apispring3.service.DoctorService;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/doctor")
@RequiredArgsConstructor(onConstructor_ = {@Autowired})
public class DoctorController {
	
	private final DoctorService doctorService;
	
	@PostMapping
	public void Register(@RequestBody @Valid DoctorRegisterForm form) {
		doctorService.Register(form);
	}
	
	@GetMapping
	public Page<DoctorRecord> findAll(@PageableDefault(size = 10, sort = "name", 
								  direction = Direction.ASC) Pageable pageable){
		return doctorService.findAll(pageable);
	}
	
	@PutMapping("/{id}")
	public DoctorRecord update(@PathVariable Long id,
							   @RequestBody @Valid DoctorUpdateForm form){
		return doctorService.update(id, form);
	}
	
	@PatchMapping("/{id}")
	public void remove(@PathVariable Long id) {
		doctorService.remove(id);
	}
	
}
