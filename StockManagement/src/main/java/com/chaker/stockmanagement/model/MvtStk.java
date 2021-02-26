package com.chaker.stockmanagement.model;
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
@Table(name ="mvtStk" )
public class MvtStk extends AbstractEntity{
    @ManyToOne
    @JoinColumn(name= "idArticle")
    private Article article;
}
