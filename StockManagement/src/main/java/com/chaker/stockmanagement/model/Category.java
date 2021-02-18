package com.chaker.stockmanagement.model;
import java.util.List;

import javax.persistence.Column;
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
public class Category extends AbstractEntity{

	@Column
	private String code;
	@Column
	private String designation;
	
	@OneToMany(mappedBy = "categoty")
	private List<Article> listeArticles;
	
}
