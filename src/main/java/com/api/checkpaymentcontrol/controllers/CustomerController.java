package com.api.checkpaymentcontrol.controllers;

import com.api.checkpaymentcontrol.models.dtos.CustomerDto;
import com.api.checkpaymentcontrol.services.CustomerService;
import jakarta.validation.Valid;
import java.util.List;
import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/customers")
public class CustomerController {

  @Autowired
  CustomerService customerService;

  @GetMapping
  public ResponseEntity<List<CustomerDto>> getAllCustomers() {
    List<CustomerDto> customers = customerService.getAllCustomers();

    if (customers.isEmpty()) {
      return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

    return ResponseEntity.ok(customers);
  }

  @GetMapping("/{id}")
  public ResponseEntity<CustomerDto> getCustomer(@PathVariable UUID id) {
    return ResponseEntity.ok(customerService.getCustomerById(id));
  }

  @GetMapping(params = "name")
  public ResponseEntity<List<CustomerDto>> getCustomerByName(@RequestParam String name) {
    System.out.println(name);
    return ResponseEntity.ok(customerService.getCustomerByName(name));
  }

  @PostMapping
  public ResponseEntity<CustomerDto> addNewCustomer(@Valid @RequestBody CustomerDto customerDto) {
    return ResponseEntity.status(HttpStatus.CREATED)
        .body(customerService.addNewCustomer(customerDto));
  }

  @PutMapping("/{id}")
  public ResponseEntity<CustomerDto> updateCustomer(@Valid @RequestBody CustomerDto customerDto,
      @PathVariable UUID id) {
    return ResponseEntity.ok(customerService.replaceAuthor(id, customerDto));
  }

  @DeleteMapping("/{id}")
  public ResponseEntity<String> deleteCustomer(@PathVariable UUID id){
    customerService.deleteCustomer(id);
    return ResponseEntity.ok().build();
  }

}
