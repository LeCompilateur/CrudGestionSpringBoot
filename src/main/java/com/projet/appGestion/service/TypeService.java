package com.projet.appGestion.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.projet.appGestion.model.Type;
import com.projet.appGestion.repository.TypeRepository;

@Service
public class TypeService {
	
	
	@Autowired
	private TypeRepository typeRepository;
	
	
	
	public Type save(Type type) {
		
		return this.typeRepository.save(type);
		
	}
	
	
	public List<Type> getAll(){
		return this.typeRepository.findAll();
	}
	
	public String delete(Type type){
		
		this.typeRepository.delete(type);
		
		return "type supprimé avec succés !";
				
	}
	
	public String deleteById(int id){
		
		this.typeRepository.deleteById(id);
		
		return "type supprimé avec succés !";
				
	}

}
