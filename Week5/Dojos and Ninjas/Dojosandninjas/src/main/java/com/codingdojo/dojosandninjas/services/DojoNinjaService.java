package com.codingdojo.dojosandninjas.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codingdojo.dojosandninjas.models.DojoModel;
import com.codingdojo.dojosandninjas.models.NinjaModel;
import com.codingdojo.dojosandninjas.repositories.DojoRepository;
import com.codingdojo.dojosandninjas.repositories.NinjaRepository;

@Service
public class DojoNinjaService {

	@Autowired
	private DojoRepository dojoRepo;
	
	@Autowired
	private NinjaRepository ninjaRepo;
	
	//all ninjas
	public List<NinjaModel> getAllNinjas(){
		return this.ninjaRepo.findAll();
	}
	
	//create ninja
	public NinjaModel createNinja(NinjaModel ninja) {
		return ninjaRepo.save(ninja);
	}
	
	//all dojos
	public List<DojoModel> getAllDojos(){
		return this.dojoRepo.findAll();
	}
	
	//create dojos
	public DojoModel createDojo(DojoModel dojo) {
		return dojoRepo.save(dojo);
	}

	public Object findAll(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public DojoModel getOne(Long id) {
		return dojoRepo.findById(id).orElse(null);
	}
}
