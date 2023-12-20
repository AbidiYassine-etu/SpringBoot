package com.project.demo.Repositories.Impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.demo.Entities.Classe;
import com.project.demo.Repositories.ClasseRepo;

@Service
public class ClasseService {
	@Autowired
	ClasseRepo classRepository;
	
	public List<Classe> getAll() {
		List<Classe> classe = new ArrayList<Classe>();
		classRepository.findAll().forEach(classe1 -> classe.add(classe1));
		return classe;
	}

	public Classe getById(Long id) {
		return classRepository.findById(id).get();
	}

	public void save(Classe newClasse) {
		classRepository.save(newClasse);
	}

	public void update(Classe newClass , Long id) {
		classRepository.save(newClass);
	}

	public void delete(Long id) {
		classRepository.deleteById(id);
	}
	
}
