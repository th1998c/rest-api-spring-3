package com.th.apispring3.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.th.apispring3.model.Doctor;
import com.th.apispring3.model.record.DoctorRegisterForm;
import com.th.apispring3.repository.DoctorRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor(onConstructor_ = {@Autowired})
public class DoctorService {
	private final DoctorRepository DoctorRepository;
	
	public void Register(DoctorRegisterForm form) {
		DoctorRepository.save(Doctor.returnDoctor(form));
	}
}
