package com.chaker.stockmanagement.model;
import javax.persistence.*;

import lombok.*;

import java.math.BigDecimal;
import java.time.Instant;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper=true)

@Entity
@Builder
@Table(name ="mvtStk" )
public class MvtStk extends AbstractEntity{

    @Column(name = "datemvt")
    private Instant dateMvt;

    @Column(name = "quantitie")
    private BigDecimal quantite;

    @Column(name = "typeMvt")
    private TypeMvtStk  typeMvt;

    @ManyToOne
    @JoinColumn(name= "idArticle")
    private Article article;
}
