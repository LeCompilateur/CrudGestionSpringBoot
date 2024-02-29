package com.projet.appGestion.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.projet.appGestion.model.Carriere;
import com.projet.appGestion.service.CarriereService;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(path = "carriere")
public class CarriereController {

    @Autowired
   private CarriereService carriereService;

    @RequestMapping(value = "add", method = RequestMethod.POST,headers = "accept=Application/json")
    public Carriere save( @RequestBody Carriere carriere){

        try {
            carriere = this.carriereService.save(carriere);
        }catch (Exception e){
            System.out.println("erreur" + e.getMessage());
        }

        return carriere;
    }

    @RequestMapping(value = "list",method = RequestMethod.GET)
    public List<Carriere> getAll(){

        List<Carriere> carrieres = new ArrayList<>();

        try {
            carrieres = this.carriereService.getAll();
        }catch (Exception e){

            System.out.println("Erreur"+e.getMessage());
        }

        return carrieres;

    }

    @RequestMapping(value = "update", method = RequestMethod.PUT, headers = "accept=Application/json")
    public Carriere update(@RequestBody Carriere carriere){

        try {
            carriere = this.carriereService.save(carriere);
        }catch (Exception e){

            System.out.println("Erreur" + e.getMessage());
        }

        return carriere;

    }



    @RequestMapping(value = "delete",method = RequestMethod.DELETE)
    public String delete(@RequestBody Carriere carriere){

        String message = new String();

        try {
            message = this.carriereService.delete(carriere);
        }catch (Exception e){

            System.out.println("Erreur" + e.getMessage());
        }

        return message;
    }
    
    @RequestMapping(value = "delete/{id}",method = RequestMethod.DELETE)
    public String deleteById(@PathVariable int id){

        String message = new String();

        try {
            message = this.carriereService.deleteById(id);
        }catch (Exception e){

            System.out.println("Erreur" + e.getMessage());
        }

        return message;

    }



}
