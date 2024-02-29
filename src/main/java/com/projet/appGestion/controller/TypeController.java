package com.projet.appGestion.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.projet.appGestion.model.Type;
import com.projet.appGestion.service.TypeService;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(path = "type")
public class TypeController {

    @Autowired
   private TypeService typeService;

    @RequestMapping(value = "add", method = RequestMethod.POST,headers = "accept=Application/json")
    public Type save( @RequestBody Type type){

        try {
            type = this.typeService.save(type);
        }catch (Exception e){
            System.out.println("erreur" + e.getMessage());
        }

        return type;
    }

    @RequestMapping(value = "list",method = RequestMethod.GET)
    public List<Type> getAll(){

        List<Type> types = new ArrayList<>();

        try {
            types = this.typeService.getAll();
        }catch (Exception e){

            System.out.println("Erreur"+e.getMessage());
        }

        return types;

    }

    @RequestMapping(value = "update", method = RequestMethod.PUT, headers = "accept=Application/json")
    public Type update(@RequestBody Type type){

        try {
            type = this.typeService.save(type);
        }catch (Exception e){

            System.out.println("Erreur" + e.getMessage());
        }

        return type;

    }



    @RequestMapping(value = "delete",method = RequestMethod.DELETE)
    public String delete(@RequestBody Type type){

        String message = new String();

        try {
            message = this.typeService.delete(type);
        }catch (Exception e){

            System.out.println("Erreur" + e.getMessage());
        }

        return message;
    }
    
    @RequestMapping(value = "delete/{id}",method = RequestMethod.DELETE)
    public String deleteById(@PathVariable int id){

        String message = new String();

        try {
            message = this.typeService.deleteById(id);
        }catch (Exception e){

            System.out.println("Erreur" + e.getMessage());
        }

        return message;

    }



}
