package com.archi.rest;

import com.archi.rest.Aeroport;

public class Billet {
    private Aeroport départ;
    private Aeroport arrivé;
    private int prix;
    private reservation reservation;

    public Billet(Aeroport départ, Aeroport arrivé, int prix)
    {
        this.départ= départ;
        this.arrivé=arrivé;
        this.prix=prix;
    }

    public Billet(Aeroport départ, Aeroport arrivé, int prix, reservation reservation)
    {
        this.départ= départ;
        this.arrivé=arrivé;
        this.prix=prix;
        this.reservation =reservation;
    }

    public static void main(String[] args) {
        Billet test = new Billet(Aeroport.CDG, Aeroport.JFK, 400);
        System.out.println(test);
    }

    @Override
    public String toString() {
        return départ +
                "-" + arrivé + ' ' +prix ;
    }


}
