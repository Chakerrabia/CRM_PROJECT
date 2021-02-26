package com.chaker.stockmanagement.dto;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Builder
public class LigneVenteDto {

    private Integer id;


    private VentesDto ventes;

    private BigDecimal qte;

    private BigDecimal prixUnitaire;
}
