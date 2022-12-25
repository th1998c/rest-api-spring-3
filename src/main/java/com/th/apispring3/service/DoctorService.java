package com.th.apispring3.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.th.apispring3.model.Doctor;
import com.th.apispring3.model.record.DoctorRecord;
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

	public Page<DoctorRecord> findAll(Pageable pageable) {
		return DoctorRepository.findAll(pageable).map(DoctorRecord::new);
	}
}
