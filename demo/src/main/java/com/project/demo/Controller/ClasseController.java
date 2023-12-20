package com.project.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.demo.Entities.Classe;
import com.project.demo.Repositories.Impl.ClasseService;

@RestController
public class ClasseController {
	@Autowired
	ClasseService classService;
	
	@GetMapping("/get_all_classes")
	private List<Classe> getAllClasses(){
		return classService.getAll();
	}
	
	@GetMapping("/get_class_by_id/{id}")
	private Classe getClasseById(@PathVariable("id") Long id) {
		return classService.getById(id);
	}
	
	@PostMapping("/save_class")
	private Long saveClass(@RequestBody Classe classe) {
		classService.save(classe);
		return classe.getId_classe();
	}
	
	@PutMapping("/update_class/{id}")
	private Classe updateClassById(@RequestBody Classe classe) {
		classService.update(classe, classe.getId_classe());
		return classe;
	}
	@DeleteMapping("delete_classe/{id}")
	private void deleteClasse(@PathVariable("id") Long id) {
		classService.delete(id);
	}
}
