package com.chaker.stockmanagement.model;

import javax.persistence.*;

import lombok.*;

import java.time.Instant;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper=true)

@Entity
@Table(name = "utilisateur")
public class Utilisateur extends AbstractEntity{

    @Column(name="nom")
    private String nom;

    @Column(name="prenom")
    private String prenom;

    @Column(name="email")
    private String email;

    @Column(name="datedenaissance")
    private Instant dateDeNaissance;

    @Column(name = "motDePasse")
    private String motDePasse;

    @Column(name="photo")
    private String photo;

    @ManyToOne
    @JoinColumn(name = "identreprise")
    private Entreprise entreprise;

    @OneToMany(mappedBy = "utilisateur")
    private List<Roles> roles;


}
