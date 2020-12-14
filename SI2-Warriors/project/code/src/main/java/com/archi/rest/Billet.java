package com.archi.rest;

import com.archi.rest.Aeroport;

public class Billet {
    private Aeroport depart;
    private Aeroport arrivee;
    private int prix;
    private Reservation reservation;

    public Billet(Aeroport depart, Aeroport arrivee, int prix)
    {
        this.depart= depart;
        this.arrivee=arrivee;
        this.prix=prix;
    }

    public Billet(Aeroport depart, Aeroport arrivee, int prix, Reservation reservation)
    {
        this.depart= depart;
        this.arrivee=arrivee;
        this.prix=prix;
        this.reservation =reservation;
    }

    public static void main(String[] args) {
        Billet test = new Billet(Aeroport.CDG, Aeroport.JFK, 400);
        System.out.println(test);
    }

    @Override
    public String toString() {
        return depart +
                "-" + arrivee + ' ' +prix ;
    }


}
