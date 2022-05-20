package com.workers.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.workers.Repositories.WorkerRepository;

@Service
public class WorkerService {
	
	@Autowired
	WorkerRepository repository;
	
	

}
