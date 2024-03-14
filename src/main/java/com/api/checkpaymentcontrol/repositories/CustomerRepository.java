package com.api.checkpaymentcontrol.repositories;

import com.api.checkpaymentcontrol.models.entities.Customer;
import java.util.List;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface CustomerRepository extends JpaRepository<Customer, UUID> {

  List<Customer> findByName(final String name);

}
