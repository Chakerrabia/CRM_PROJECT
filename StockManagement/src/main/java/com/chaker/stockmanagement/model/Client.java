package com.chaker.stockmanagement.model;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
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
public class Client extends AbstractEntity{
	
		@Column
		private String nom ;
		
		@Column
		private String prenom ;
		
		@Embedded
		private Adresse adresse ;
		
		@Column
		private String photo ;
		
		@Column
		private String mail ;
		
		@Column
		private String numTel ;
		
		@OneToMany(mappedBy = "client")
		private List<CommandeClient> commandeClients;
		
		
}
