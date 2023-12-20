package com.project.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.demo.Entities.Matieres;
import com.project.demo.Repositories.Impl.MatieresService;

@RestController
public class MatieresController {
	@Autowired
	MatieresService matService;
	
	@GetMapping("/get_all_matieres")
	private List<Matieres> getAll() {
		return matService.getAll();
	}
	
	@GetMapping("/get_matieres_by_id/{id}")
	private Matieres getById(@PathVariable("id") Long id) {
		return matService.findById(id);
	}
	
	@PostMapping("/save_matieres")
	private Matieres save(@RequestBody Matieres newMat) {
		matService.save(newMat);
		return newMat;
	}
	
	@DeleteMapping("/delete_matieres/{id}")
	private void delete(@PathVariable("id") Long id) {
		matService.delete(id);
	}
	
	
}
