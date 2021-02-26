package com.chaker.stockmanagement.dto;

import com.chaker.stockmanagement.model.TypeMvtStk;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.time.Instant;

@Data
@Builder

public class MvtStkDto {

    private Integer id;

    private Instant dateMvt;

    private BigDecimal quantite;

    private TypeMvtStk typeMvt;

    private ArticleDto article;
}
