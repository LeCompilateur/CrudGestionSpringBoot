package com.projet.appGestion.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projet.appGestion.model.Localite;
import com.projet.appGestion.repository.LocaliteRepository;

@Service
public class LocaliteService {
	
	
	@Autowired
	private LocaliteRepository localiteRepository;
	
	
	
	public Localite save(Localite localite) {
		
		return this.localiteRepository.save(localite);
		
	}
	
	
	public List<Localite> getAll(){
		return this.localiteRepository.findAll();
	}
	
	public String delete(Localite localite){
		
		this.localiteRepository.delete(localite);
		
		return "localite supprimée avec succés !";
				
	}
	
	public String deleteById(int id){
		
		this.localiteRepository.deleteById(id);
		
		return "localite supprimée avec succés !";
				
	}


}
