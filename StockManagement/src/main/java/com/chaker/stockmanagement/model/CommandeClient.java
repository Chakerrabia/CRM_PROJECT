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
@Table(name ="commandeClient")
public class CommandeClient extends AbstractEntity{
	
	@Column(name = "code")
	private String code;
	@Column(name = "dateCommande")
	private Instant dateCommande;
	
	@OneToMany(mappedBy = "commandeClient")
	private List<LigneCommandeClient> ligneCommandeClient;

	@ManyToOne
	@JoinColumn(name= "idClient")
	private Client client;
	
}
