package com.api.checkpaymentcontrol.models.mappers;

import com.api.checkpaymentcontrol.models.dtos.CustomerDto;
import com.api.checkpaymentcontrol.models.entities.Customer;
import java.util.List;
import org.mapstruct.Mapper;

@Mapper
public interface CustomerMapper {

  CustomerDto customerToCustomerDto(Customer customer);

  Customer CustomerDtoToCustomer(CustomerDto customerDto);

  List<CustomerDto> customerToCustomerDto(List<Customer> customer);

  List<Customer> CustomerDtoToCustomer(List<CustomerDto> customerDto);

}
