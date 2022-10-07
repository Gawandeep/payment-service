package com.example.paymentService.service;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.paymentService.entity.Payment;
import com.example.paymentService.repository.PaymentRepository;

@Service
public class PaymentService {
	
	@Autowired
	private PaymentRepository paymentRepository;

	public Payment savePayment(Payment payment) {
		payment.setTrans_id(UUID.randomUUID().toString());
		return paymentRepository.save(payment);
	}
}
