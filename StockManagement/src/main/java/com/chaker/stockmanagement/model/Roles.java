package com.chaker.stockmanagement.model;
import javax.persistence.*;

import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper=true)

@Entity
@Table(name = "roles")
public class Roles extends AbstractEntity{

    @Column(name = "nom")
    private String roleName;

    @ManyToOne
    @JoinColumn(name= "idutilisateur")
    private Utilisateur utilisateur;
}
