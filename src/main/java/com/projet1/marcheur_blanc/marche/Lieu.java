package com.projet1.marcheur_blanc.marche;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;
import java.util.Random;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class Lieu {
    private String name;
    private final List<Rue> routePossible;

    public Lieu deplacement() {
        Random random = new Random();

        Rue route = routePossible.get(random.nextInt(routePossible.size()));

        return route.directionPossible(this);
    }
}
