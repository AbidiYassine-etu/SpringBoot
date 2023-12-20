package com.project.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.project.demo.Repositories.CoursService;

import jakarta.annotation.Resource;

@SpringBootApplication
public class ProjectApplication implements CommandLineRunner{

	@Resource
	  CoursService coursService;
	public static void main(String[] args) {
		SpringApplication.run(ProjectApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		coursService.init();
		
	}
	
	

}
