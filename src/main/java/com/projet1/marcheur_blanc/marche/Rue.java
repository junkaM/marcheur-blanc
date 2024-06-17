package com.projet1.marcheur_blanc.marche;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Rue {
    private Lieu lieu1;
    private Lieu lieu2;

    public Lieu directionPossible(Lieu lieu){
        return lieu.equals(lieu1) ? lieu2 : lieu1;
    }
}
