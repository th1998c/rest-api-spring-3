package com.th.apispring3.model.record;

import jakarta.validation.constraints.Size;
								
public record DoctorUpdateForm(
		                       @Size(min = 1)
							   String name,
							   @Size(min = 10, max = 11)
							   String telephone,
							   AdressForm adress) {
}
