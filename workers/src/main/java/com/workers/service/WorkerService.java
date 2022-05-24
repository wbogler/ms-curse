package com.workers.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.workers.Repositories.WorkerRepository;
import com.workers.entity.Worker;

@Service
public class WorkerService {
	
	@Autowired
	WorkerRepository repository;
	
	public List<Worker> findAll(){
		List<Worker> result = repository.findAll();
		return result;
	}
	
	public Worker findById(Long id){
		Optional<Worker> obj = repository.findById(id);
		return obj.get();
	}
	

}
