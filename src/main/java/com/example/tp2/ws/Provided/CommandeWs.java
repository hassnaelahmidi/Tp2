package com.example.tp2.ws.Provided;

import com.example.tp2.Service.Facade.CommandeService;
import com.example.tp2.bean.Commande;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/app/Commande")
public class CommandeWs {
    @Autowired
    CommandeService commandeService;
@GetMapping("/ref/{ref}")
    public Commande findByRef(@PathVariable String ref) {
        return commandeService.findByRef(ref);
    }
    @DeleteMapping("/ref/{ref}")

    public int deleteByRef(@PathVariable String ref) {
        return commandeService.deleteByRef(ref);
    }
@PostMapping("/")
    public Commande save(@RequestBody Commande commande) {
        return commandeService.save(commande);
    }
@GetMapping("/")
    public List<Commande> findAll() {
        return commandeService.findAll();
    }
}
