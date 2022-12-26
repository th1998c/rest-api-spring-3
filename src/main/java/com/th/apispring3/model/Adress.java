package com.th.apispring3.model;

import com.th.apispring3.model.record.AdressForm;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class Adress {
	 private String street;
	 private String district;
	 private String zipCode;
	 private String city;
	 private String uf;
	 private String complement;
	 private Integer number;
	 
	public void UpdateData(AdressForm form) {
		if(form.street() != null) {
			this.street = form.street();
		}
		if(form.district() != null) {
			this.district = form.district();
		}
		if(form.zipCode() != null) {
			this.zipCode = form.zipCode();
		}
		if(form.city() != null) {
			this.city = form.city();
		}
		if(form.uf() != null) {
			this.uf = form.uf();
		}
		if(form.complement() != null) {
			this.complement = form.complement();
		}
		if(form.number() != null) {
			this.number = form.number();
		}
	}
}
