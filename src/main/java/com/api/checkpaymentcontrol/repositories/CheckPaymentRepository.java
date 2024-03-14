package com.api.checkpaymentcontrol.repositories;

import com.api.checkpaymentcontrol.models.entities.CheckPayment;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CheckPaymentRepository extends JpaRepository<CheckPayment, UUID> {

}
