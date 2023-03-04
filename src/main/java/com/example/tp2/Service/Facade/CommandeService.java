package com.example.tp2.Service.Facade;

import com.example.tp2.bean.Commande;

import java.util.List;

public interface CommandeService {
    Commande findByRef(String ref);
    int deleteByRef(String ref);
     Commande save(Commande commande);
     List<Commande> findAll();
}
