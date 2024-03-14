package com.api.checkpaymentcontrol.services;

import com.api.checkpaymentcontrol.models.mappers.StoreMapper;
import com.api.checkpaymentcontrol.repositories.StoreRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class StoreService {

  @Autowired
  StoreRepository storeRepository;

  @Autowired
  StoreMapper storeMapper;
}
