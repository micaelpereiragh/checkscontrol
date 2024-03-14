package com.api.checkpaymentcontrol.repositories;

import com.api.checkpaymentcontrol.models.entities.Store;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StoreRepository extends JpaRepository<Store, UUID> {

}
