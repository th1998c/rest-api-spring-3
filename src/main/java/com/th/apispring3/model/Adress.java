package com.th.apispring3.model;

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
}
