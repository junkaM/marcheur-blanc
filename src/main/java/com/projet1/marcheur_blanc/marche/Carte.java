package com.projet1.marcheur_blanc.marche;

import lombok.Getter;

import java.util.List;

@Getter
public record Carte(List<Lieu> carte) {
}
