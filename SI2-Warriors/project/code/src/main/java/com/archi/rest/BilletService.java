package com.archi.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@EnableJpaRepositories(basePackages = {"com.archi.rest"})
public class BilletService {

    private ArrayList<Billet> list;

//    @Autowired
//    public BilletService(ArrayList<Billet> list) {
//        this.list = list;
//    }

    public int addBillet(Billet b)
    {
        this.list.add(b);
        return 0;
    }

    public ArrayList<Billet> affiche()
    {
        return this.list;
    }

}
