package com.chaker.stockmanagement.model;
import java.time.Instant;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper=true)

@Entity
@Table
public class CommandeFournisseur extends AbstractEntity{
	@Column
	public String code;
	@Column
	public Instant dateCommande;
	
	@ManyToOne
	@JoinColumn(name ="idFournisseur")
	private Fournisseur fournisseur;
	
	
	@OneToMany(mappedBy = "CommandeFournisseur")
	private List<LigneCommandeFournisseur> ligneCommandeFournisseur;
	
	
}
