package com.chaker.stockmanagement.dto;

import com.chaker.stockmanagement.model.Entreprise;
import com.chaker.stockmanagement.model.Roles;
import lombok.Builder;
import lombok.Data;

import java.time.Instant;
import java.util.List;

@Data
@Builder
public class UtilisateurDto {

    private Integer id;

    private String nom;

    private String prenom;

    private String email;

    private Instant dateDeNaissance;

    private String motDePasse;

    private String photo;

    private EntrepriseDto entreprise;

    private List<RolesDto> roles;
}
