package com.mscurse.hrpayroll.services;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.mscurse.hrpayroll.entities.Payment;
import com.mscurse.hrpayroll.entities.Worker;
import com.mscurse.hrpayroll.feignClients.WorkerFeignClient;

@Service
public class PaymentService {
	
	@Autowired
	private WorkerFeignClient workerFeign;
	
	public Payment getPayment(long workerId, int days) {
		Worker worker = workerFeign.findById(workerId).getBody();
		return new Payment(worker.getName(), worker.getDailyIncome(),days);
	}

}
