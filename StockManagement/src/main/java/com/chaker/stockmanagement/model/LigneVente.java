package com.chaker.stockmanagement.model;
import javax.persistence.*;

import com.chaker.stockmanagement.dto.VentesDto;
import lombok.*;

import java.math.BigDecimal;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper=true)

@Entity
@Table(name = "ligneVente")
public class LigneVente extends AbstractEntity{

    @ManyToOne
    @JoinColumn(name="idvente")
    private Ventes ventes;

    @Column(name = "quantity" )
    private BigDecimal quantity;

    @Column(name = "prixunitaire" )
    private BigDecimal prixUnitaire;
}
