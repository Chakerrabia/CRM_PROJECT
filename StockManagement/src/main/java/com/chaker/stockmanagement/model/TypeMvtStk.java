package com.chaker.stockmanagement.model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper=true)

@Entity
@Builder
@Table(name ="typemvtstk" )
public class TypeMvtStk extends AbstractEntity {
    @Column(name = "nom")
    private String nom;
}
