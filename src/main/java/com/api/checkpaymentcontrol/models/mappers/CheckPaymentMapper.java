package com.api.checkpaymentcontrol.models.mappers;

import com.api.checkpaymentcontrol.models.dtos.CheckPaymentDto;
import com.api.checkpaymentcontrol.models.entities.CheckPayment;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface CheckPaymentMapper {

  @Mapping(source = "customer.customerId", target = "customerId")
  CheckPaymentDto checkPaymentToCheckDtoPayment(CheckPayment check);

  @Mapping(source = "customerId", target = "customer.customerId")
  CheckPayment checkPaymentDtoToCheckPayment(CheckPaymentDto checkPaymentDto);

}
