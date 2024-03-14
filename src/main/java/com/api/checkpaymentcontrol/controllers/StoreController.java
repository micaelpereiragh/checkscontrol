package com.api.checkpaymentcontrol.controllers;

import com.api.checkpaymentcontrol.services.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/stores")
public class StoreController {

  @Autowired
  StoreService storeService;

}
