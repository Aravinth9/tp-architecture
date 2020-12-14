package com.archi.rest;

import com.archi.rest.Aeroport;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.CrossOrigin;

import javax.persistence.EntityListeners;

@EntityScan
@CrossOrigin
@EntityListeners(AuditingEntityListener.class)
@EnableJpaRepositories(basePackages = {"com.archi.rest"})
public class Billet {
    private String depart;
    private String arrivee;
    private int prix;
    private Reservation reservation;

    public Billet(String dep, String arr, int prix)
    {
        this.depart = dep;
        this.arrivee = arr;
        this.prix=prix;
    }

    public Billet(String dep, String arr, int prix, Reservation reservation)
    {
        this.depart= dep;
        this.arrivee=arr;
        this.prix=prix;
        this.reservation =reservation;
    }

    public static void main(String[] args) {
        Aeroport airport = new Aeroport();
        Billet test = new Billet(airport.getAirport(0), airport.getAirport(1), 400);
        System.out.println(test);
    }

    @Override
    public String toString() {
        return depart +
                "-" + arrivee + ' ' +prix ;
    }


}
