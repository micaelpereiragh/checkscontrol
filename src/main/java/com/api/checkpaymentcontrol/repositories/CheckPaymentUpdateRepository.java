package com.api.checkpaymentcontrol.repositories;

import com.api.checkpaymentcontrol.models.entities.CheckPaymentUpdate;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CheckPaymentUpdateRepository extends JpaRepository<CheckPaymentUpdate, UUID> {

}
