package com.example.paymentService.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.paymentService.entity.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Integer>{

}
