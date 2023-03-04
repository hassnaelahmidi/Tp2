package com.example.tp2.Service.Impl;

import com.example.tp2.Dao.CommandeDao;
import com.example.tp2.Service.Facade.CommandeService;
import com.example.tp2.bean.Commande;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CommandeServiceImpl implements CommandeService {
    @Autowired
    CommandeDao commandeDao;


    public Commande findByRef(String ref) {
        return commandeDao.findByRef(ref);
    }


    public int deleteByRef(String ref) {
        return commandeDao.deleteByRef(ref);
    }

    public  List<Commande> findAll() {
        return commandeDao.findAll();
    }
    public Commande save(Commande commande){
        return commandeDao.save(commande);
    }

}
