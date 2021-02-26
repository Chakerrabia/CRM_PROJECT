package com.chaker.stockmanagement.model;

import javax.persistence.Column;
import javax.persistence.Entity;
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
@Table(name = "ventes")
public class Ventes extends AbstractEntity{
    //FIXME
    @Column(name="code")
    private String code;

}
