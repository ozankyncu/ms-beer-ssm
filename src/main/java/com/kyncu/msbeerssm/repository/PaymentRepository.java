package com.kyncu.msbeerssm.repository;

import com.kyncu.msbeerssm.domain.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment, Long> {

}
