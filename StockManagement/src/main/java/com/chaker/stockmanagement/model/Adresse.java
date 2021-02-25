package com.chaker.stockmanagement.model;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Embeddable
public class Adresse {
	@Column
	private String adresse1;
	@Column
	private String adresse2;
	@Column
	private String ville;
	@Column
	private String codePostale;
	@Column
	private String pays;


}
