package com.th.apispring3.service;

import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.th.apispring3.model.Doctor;
import com.th.apispring3.model.record.DoctorRecord;
import com.th.apispring3.model.record.DoctorRegisterForm;
import com.th.apispring3.model.record.DoctorUpdateForm;
import com.th.apispring3.repository.DoctorRepository;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor(onConstructor_ = {@Autowired})
public class DoctorService {
	private final DoctorRepository doctorRepository;
	
	@Transactional
	public void Register(DoctorRegisterForm form) {
		doctorRepository.save(Doctor.returnDoctor(form));
	}

	public Page<DoctorRecord> findAll(Pageable pageable) {
		return doctorRepository.findAll(pageable).map(DoctorRecord::new);
	}
	
	public Doctor findById(Long id) {
		return doctorRepository.findById(id).map(doctor -> doctor).
							orElseThrow(() -> new NoSuchElementException("Doctor with id "+ id +" not found."));
	}
	
	@Transactional
	public DoctorRecord update(Long id, @Valid DoctorUpdateForm form) {
		var doctor = findById(id);
		return new DoctorRecord(doctor.updateData(form));
	}
	
	@Transactional
	public void remove(Long id) {
		var doctor = findById(id);
		doctor.setActive(false);
	}
}
