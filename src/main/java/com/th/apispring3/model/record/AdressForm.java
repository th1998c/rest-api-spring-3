package com.th.apispring3.model.record;

public record AdressForm(String street,
						 String district,
						 String zipCode,
						 String city,
						 String uf,
						 String complement,
						 Integer number) {
}
