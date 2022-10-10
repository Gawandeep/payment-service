package com.example.paymentService.service;

import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.paymentService.entity.Payment;
import com.example.paymentService.repository.PaymentRepository;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import lombok.extern.slf4j.Slf4j;


@Service
@Slf4j
public class PaymentService {
	
	@Autowired
	private PaymentRepository paymentRepository;
	
	

	public Payment savePayment(Payment payment) throws JsonProcessingException {
		payment.setTrans_id(UUID.randomUUID().toString());
		log.info("Payment Request : {} ", new ObjectMapper().writeValueAsString(payment));
		return paymentRepository.save(payment);
	}
}
