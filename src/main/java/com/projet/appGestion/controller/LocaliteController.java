package com.projet.appGestion.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.projet.appGestion.model.Localite;
import com.projet.appGestion.service.LocaliteService;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(path = "localite")
public class LocaliteController {

    @Autowired
   private LocaliteService localiteService;

    @RequestMapping(value = "add", method = RequestMethod.POST,headers = "accept=Application/json")
    public Localite save( @RequestBody Localite localite){

        try {
            localite = this.localiteService.save(localite);
        }catch (Exception e){
            System.out.println("erreur" + e.getMessage());
        }

        return localite;
    }

    @RequestMapping(value = "list",method = RequestMethod.GET)
    public List<Localite> getAll(){

        List<Localite> localites = new ArrayList<>();

        try {
            localites = this.localiteService.getAll();
        }catch (Exception e){

            System.out.println("Erreur"+e.getMessage());
        }

        return localites;

    }

    @RequestMapping(value = "update", method = RequestMethod.PUT, headers = "accept=Application/json")
    public Localite update(@RequestBody Localite localite){

        try {
            localite = this.localiteService.save(localite);
        }catch (Exception e){

            System.out.println("Erreur" + e.getMessage());
        }

        return localite;

    }



    @RequestMapping(value = "delete",method = RequestMethod.DELETE)
    public String delete(@RequestBody Localite localite){

        String message = new String();

        try {
            message = this.localiteService.delete(localite);
        }catch (Exception e){

            System.out.println("Erreur" + e.getMessage());
        }

        return message;
    }
    
    @RequestMapping(value = "delete/{id}",method = RequestMethod.DELETE)
    public String deleteById(@PathVariable int id){

        String message = new String();

        try {
            message = this.localiteService.deleteById(id);
        }catch (Exception e){

            System.out.println("Erreur" + e.getMessage());
        }

        return message;

    }



}
