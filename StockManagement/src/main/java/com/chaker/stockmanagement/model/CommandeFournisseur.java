package com.chaker.stockmanagement.model;
import java.time.Instant;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper=true)

@Entity
@Table(name = "commandeFournisseur")
public class CommandeFournisseur extends AbstractEntity{
	@Column(name = "code")
	public String code;
	@Column(name = "dateCommande")
	public Instant dateCommande;
	
	@ManyToOne
	@JoinColumn(name ="idFournisseur")
	private Fournisseur fournisseur;
	
	
	@OneToMany(mappedBy = "commandeFournisseurs")
	private List<LigneCommandeFournisseur> ligneCommandeFournisseur;
	
	
}
