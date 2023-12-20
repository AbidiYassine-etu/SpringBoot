package com.project.demo.Repositories.Impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.demo.Entities.Matieres;
import com.project.demo.Repositories.MatiereRepo;

@Service
public class MatieresService {
	@Autowired
	MatiereRepo matRepository;
	
	public List<Matieres> getAll(){
		List<Matieres> matieres = new ArrayList<Matieres>();
		matRepository.findAll().forEach(matieres1-> matieres.add(matieres1));
		return matieres;
	}
	
	public Matieres save(Matieres newMat) {
		matRepository.save(newMat);
		return newMat;
	}
	
	public Matieres findById(Long id) {
		return matRepository.findById(id).get();
	}
	
	public void delete(Long id) {
		matRepository.deleteById(id);
	}
}
