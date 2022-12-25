package com.th.apispring3.model.record;

import com.th.apispring3.model.Doctor;
import com.th.apispring3.model.Enum.Specialty;

public record DoctorRecord(Long id, String name, String email, String crm, Specialty specialty){
	
	public DoctorRecord(Doctor doctor) {
		this(doctor.getId(), doctor.getName(), doctor.getEmail(), doctor.getCrm(), doctor.getSpecialty());
	}
}
