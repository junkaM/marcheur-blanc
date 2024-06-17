package com.projet1.marcheur_blanc.marche;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@Getter
@Setter
public class Marcheur {
    private String name;
    private String origine;
    private Carte carte;
    public List<Lieu> marche (Lieu depart, Lieu destination){

        List<Lieu> itineraire = new ArrayList<>();
        Lieu positionActuel = depart;

        itineraire.add(positionActuel);

        while (!positionActuel.getName().equals(destination.getName())){
            positionActuel = positionActuel.deplacement();
            itineraire.add(positionActuel);
        }

        return itineraire;
    }
}
