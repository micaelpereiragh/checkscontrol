package com.api.checkpaymentcontrol.models.mappers;

import com.api.checkpaymentcontrol.models.dtos.CheckPaymentUpdateDto;
import com.api.checkpaymentcontrol.models.entities.CheckPaymentUpdate;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface CheckPaymentUpdateMapper {

  @Mapping(source = "check.checkId", target = "checkId")
  CheckPaymentUpdateDto checkUpdateToCheckUpdateDto(CheckPaymentUpdate checkPaymentUpdate);

  @Mapping(source = "checkId", target = "check.checkId")
  CheckPaymentUpdate checkUpdateDtoToCheckUpdate(CheckPaymentUpdateDto checkPaymentUpdateDto);

}
