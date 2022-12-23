package com.th.apispring3.model.record;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public record AdressForm(
						 @NotBlank
						 String street,
						 @NotBlank
						 String district,
						 @NotBlank
						 @Pattern(regexp = "\\d{8}")
						 String zipCode,
						 @NotBlank
						 String city,
						 @NotBlank
						 String uf,
						 
						 String complement,
						 
						 Integer number) {}
