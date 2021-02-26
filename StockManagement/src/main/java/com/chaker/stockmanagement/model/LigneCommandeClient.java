package com.chaker.stockmanagement.model;
import javax.persistence.*;

import lombok.*;

import java.math.BigDecimal;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper=true)

@Entity
@Table(name = "ligneCommandeClient")
public class LigneCommandeClient extends AbstractEntity{
		
		@ManyToOne
		@JoinColumn(name= "idArticle")
		private Article article;
		
	
		@ManyToOne
		@JoinColumn(name= "idCommandeClient")
		private CommandeClient commandeClient;

		@Column(name = "quantite")
		private BigDecimal quantite;

		@Column(name = "prixunitaire")
		private BigDecimal prixUnitaire;
}
