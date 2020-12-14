package com.archi.rest;

import com.archi.rest.BilletService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class Controller {

    @Autowired
    private final BilletService billetService;

    public Controller(BilletService billetService)
    {
        this.billetService = billetService;
    }

    @GetMapping("/liste")
    public ArrayList<Billet> test ()
    {
        System.out.println("bonjour");
        Billet a = new Billet(Aeroport.JFK,Aeroport.CDG,400, new Reservation(1,false));
        billetService.addBillet(a);
        System.out.println(billetService.affiche());
        return billetService.affiche();
    }


    @PostMapping("/reservation")
    public int addBillet(@RequestBody Billet b) {
        billetService.addBillet(b);
        return 0;
    }
}
