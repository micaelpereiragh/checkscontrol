package com.api.checkpaymentcontrol.services;

import com.api.checkpaymentcontrol.models.dtos.CustomerDto;
import com.api.checkpaymentcontrol.models.entities.Customer;
import com.api.checkpaymentcontrol.models.mappers.CustomerMapper;
import com.api.checkpaymentcontrol.repositories.CustomerRepository;
import jakarta.transaction.Transactional;
import java.util.List;
import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class CustomerService {

  @Autowired
  CustomerRepository customerRepository;

  @Autowired
  CustomerMapper customerMapper;


  public List<CustomerDto> getAllCustomers() {
    return customerMapper.customerToCustomerDto(customerRepository.findAll());
  }

  public CustomerDto getCustomerById(final UUID id) {
    Customer customer = findByIdOrThrowException(id);
    return customerMapper.customerToCustomerDto(customer);
  }

  public List<CustomerDto> getCustomerByName(final String name) {
    List<Customer> customer = customerRepository.findByName(name);

    return customerMapper.customerToCustomerDto(customer);
  }

  @Transactional
  public CustomerDto addNewCustomer(final CustomerDto customerDto) {
    return customerMapper.customerToCustomerDto(
        customerRepository.save(customerMapper.CustomerDtoToCustomer(customerDto)));
  }

  //TODO: entender como funcionaria o update de stores ou checks
  @Transactional
  public CustomerDto replaceAuthor(final UUID id, final CustomerDto customerDto) {
    return customerMapper.customerToCustomerDto(customerRepository.findById(id)
        .map(customer -> {
              customer.setName(customerDto.getName());
              customer.setEmail(customerDto.getEmail());
              customer.setAddress(customerDto.getAddress());
              customer.setNotes(customerDto.getNotes());
              customer.setPhoneNumber(customerDto.getPhoneNumber());
              return customerRepository.save(customer);
            })
        .orElseThrow(() -> new RuntimeException("Customer not found")));
  }

  private Customer findByIdOrThrowException(final UUID id) {
    return customerRepository.findById(id)
        .orElseThrow(() -> new RuntimeException("Customer not found"));

  }

  public void deleteCustomer(UUID id) {
    customerRepository.delete(findByIdOrThrowException(id));
  }
}
