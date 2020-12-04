package com.archi.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class BilletService {

    private final ArrayList<Billet> list;

    @Autowired
    public BilletService(ArrayList<Billet> list) {
        this.list = list;
    }

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
