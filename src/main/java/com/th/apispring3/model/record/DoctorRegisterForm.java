package com.th.apispring3.model.record;

import com.th.apispring3.model.Enum.Specialty;

public record DoctorRegisterForm(String name,
								 String email, 
								 String crm,
								 Specialty specialty,
								 AdressForm adress) {
}
