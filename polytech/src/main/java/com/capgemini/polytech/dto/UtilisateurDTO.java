package com.capgemini.polytech.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class UtilisateurDTO {
    private int id;
    private String nom;
    private String prenom;
    private String mail;
    private String username;
    private String password;
}
