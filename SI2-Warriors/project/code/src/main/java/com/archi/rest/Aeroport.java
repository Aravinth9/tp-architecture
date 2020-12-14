package com.archi.rest;

import java.util.ArrayList;
import java.util.List;

public class Aeroport {
   private List<String> airport;

   public Aeroport() {
       List<String> arp = new ArrayList<String>();
       arp.add("CGG");
       arp.add("NYC");
       arp.add("LON");
       arp.add("CTN");

       this.airport = arp;
   }

    public String getAirport(int i) {
        return airport.get(i);
    }
}

