package com.th.apispring3.model.record;

import com.th.apispring3.model.Enum.Specialty;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public record DoctorRegisterForm(
								 @NotBlank
								 String name,
								 
								 @NotBlank
								 @Email
								 String email,
								 
								 @NotBlank 
								 @Pattern(regexp = "\\d{4,6}")
								 String crm,
								 
								 @NotNull
								 Specialty specialty,
								 
								 @NotNull
								 @Valid
								 AdressForm adress) {}
