package com.chaker.stockmanagement.dto;

import lombok.Builder;
import lombok.Data;

import java.time.Instant;
import java.util.List;

@Data
@Builder

public class CommandeFournisseurDto {

    private Integer id;

    public String code;

    public Instant dateCommande;



    private FournisseurDto fournisseur;



    private List<LigneCommandeFournisseurDto> ligneCommandeFournisseur;

}
