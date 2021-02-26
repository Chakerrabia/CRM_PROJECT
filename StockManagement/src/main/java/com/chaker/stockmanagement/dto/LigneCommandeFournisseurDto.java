package com.chaker.stockmanagement.dto;

import com.chaker.stockmanagement.model.Article;
import com.chaker.stockmanagement.model.CommandeFournisseur;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Builder
public class LigneCommandeFournisseurDto {

    private Integer id;

    private ArticleDto article;

    private CommandeFournisseurDto commandeFournisseurs;


    private BigDecimal quantite;

    private BigDecimal prixUnitaire;
}
