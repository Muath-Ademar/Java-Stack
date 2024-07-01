package com.example.dojoNinjas.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;


import com.example.dojoNinjas.models.Ninja;
import com.example.dojoNinjas.repositories.NinjaRepository;

@Service
public class NinjaService {
	private final NinjaRepository ninjaRepository;
	public NinjaService(NinjaRepository ninjaRepository) {
		this.ninjaRepository = ninjaRepository;
	}
	public List<Ninja> allNinja(){
		return ninjaRepository.findAll();
	}
	public Ninja createNinja(Ninja n) {
		return   ninjaRepository.save(n);
	}
	public Ninja findNinja(Long id) {
        Optional<Ninja> optionalNinja = ninjaRepository.findById(id);
        if(optionalNinja.isPresent()) {
            return optionalNinja.get();
        } else {
            return null;
        }
	}
}
