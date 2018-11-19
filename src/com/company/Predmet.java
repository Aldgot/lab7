package com.company;

public enum Predmet {
    MATH(8), BIOLOGY(11), HISTORY(8);

    private int ocenka;

    Predmet (int ocenka) {
        this.ocenka = ocenka;
    }

    public int getOcenka(){
        return ocenka;
    }
}

