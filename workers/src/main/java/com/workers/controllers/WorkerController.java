package com.workers.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.workers.entity.Worker;
import com.workers.service.WorkerService;

@RestController
@RequestMapping(value = "/workers")
public class WorkerController {
	
	@Autowired
	WorkerService workerService;
	
	@GetMapping
	public ResponseEntity<List<Worker>> findAll(){
		List<Worker> result = workerService.findAll();
		return ResponseEntity.ok(result);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Worker> findById(@PathVariable Long id){
		Worker obj = workerService.findById(id);
		return ResponseEntity.ok().body(obj);
	}

}