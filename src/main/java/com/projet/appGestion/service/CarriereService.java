package com.projet.appGestion.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projet.appGestion.model.Carriere;
import com.projet.appGestion.repository.CarriereRepository;

@Service
public class CarriereService {
	
	
	@Autowired
	private CarriereRepository carriereRepository;
	
	
	
	public Carriere save(Carriere carriere) {
		
		System.out.println(carriere+ "........................");
		
		return this.carriereRepository.save(carriere);
		
	}
	
	
	public List<Carriere> getAll(){
		return this.carriereRepository.findAll();
	}
	
	public String delete(Carriere carriere){
		
		this.carriereRepository.delete(carriere);
		
		return "carriere supprimée avec succés !";
				
	}
	
	public String deleteById(int id){
		
		this.carriereRepository.deleteById(id);
		
		return "carriere supprimée avec succés !";
				
	}

}
