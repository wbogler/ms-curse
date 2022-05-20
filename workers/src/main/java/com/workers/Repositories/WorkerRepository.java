package com.workers.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.workers.entity.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long> {

}
