package com.chaker.stockmanagement.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
public class Article extends AbstractEntity{
	@Column	
	private String codeArticle;
	@Column
	private String designation;
	@Column
	private BigDecimal prixUnitaireHt;
	@Column
	private BigDecimal prixUnitaireTtc;
	@Column
	private String photo; 
	@ManyToOne
	@JoinColumn(name="idcategory")
	private Category category;
}
