package com.capgemini.polytech.dto;

import com.capgemini.polytech.entity.ReservationId;
import com.capgemini.polytech.entity.Utilisateur;
import com.capgemini.polytech.entity.Velo;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ReservationDTO {
    private int reservation;
    private Velo velo;
    private Utilisateur utilisateur;

}
