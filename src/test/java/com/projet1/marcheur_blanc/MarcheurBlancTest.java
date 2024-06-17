package com.projet1.marcheur_blanc;

import com.projet1.marcheur_blanc.marche.Carte;
import com.projet1.marcheur_blanc.marche.Lieu;
import org.junit.jupiter.api.Test;

import java.util.List;


public class MarcheurBlancTest {

    @Test
    public void testMarcheAleatoire() {
        Carte carte = new Carte();

        Lieu hei = new Lieu("HEI");
        Lieu pullman = new Lieu("Pullman");
        Lieu sekolintsika = new Lieu("Sekolintsika");
        Lieu marais = new Lieu("Marais");
        Lieu balançoire = new Lieu("Balançoire");
        Lieu nexta = new Lieu("Nexta");
        Lieu boulevardDeLEurope = new Lieu("Boulevard de l'Europe");
        Lieu esti = new Lieu("ESTI");


        carte.ajouterRoute("HEI", "Pullman");
        carte.ajouterRoute("HEI", "Sekolintsika");
        carte.ajouterRoute("Pullman", "Balançoire");
        carte.ajouterRoute("Pullman", "Nexta");
        carte.ajouterRoute("Sekolintsika", "Marais");
        carte.ajouterRoute("Balançoire", "Boulevard de l'Europe");
        carte.ajouterRoute("Balançoire", "ESTI");

        List<String> chemin = MarcheurBlanc.marcheAleatoire(hei, esti);
        assertTrue(chemin.contains("ESTI"));
    }

}
