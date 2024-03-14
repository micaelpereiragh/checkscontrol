package com.api.checkpaymentcontrol.models.mappers;

import com.api.checkpaymentcontrol.models.dtos.StoreDto;
import com.api.checkpaymentcontrol.models.entities.Store;
import org.mapstruct.Mapper;

@Mapper
public interface StoreMapper {

  StoreDto storeToStoreDto(Store store);

  Store storeDtoToStore(StoreDto storeDto);

}
