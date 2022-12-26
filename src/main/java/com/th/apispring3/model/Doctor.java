package com.th.apispring3.model;

import com.th.apispring3.model.Enum.Specialty;
import com.th.apispring3.model.record.DoctorRegisterForm;
import com.th.apispring3.model.record.DoctorUpdateForm;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
@Table(name = "doctors")
@Entity(name = "Doctor")
public class Doctor {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String email;
	private String telephone;
	private String crm;
	private boolean Active;
	
	@Enumerated(EnumType.STRING)
	private Specialty specialty;
	
	@Embedded
	private Adress adress;

	public static Doctor returnDoctor(DoctorRegisterForm form) {
		return Doctor.builder().name(form.name()).email(form.email()).telephone(form.telephone()).crm(form.crm())
					  .Active(true).specialty(form.specialty()).adress(Adress.builder().street(form.adress().street())
					  .district(form.adress().district()).zipCode(form.adress().zipCode())
					  .city(form.adress().city()).uf(form.adress().uf())
					  .complement(form.adress().complement()).number(form.adress().number()).build())
			  		  .build();
	}

	public Doctor updateData( DoctorUpdateForm form) {
		if(form.name() != null) {
			this.setName(form.name());
		}
		if(form.telephone() != null) {
			this.setTelephone(form.telephone());
		}
		if(form.adress() != null) {
			this.adress.UpdateData(form.adress());
		}
		
		return this;
	}
}
