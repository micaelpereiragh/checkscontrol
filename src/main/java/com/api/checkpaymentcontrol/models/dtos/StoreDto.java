package com.api.checkpaymentcontrol.models.dtos;

import com.api.checkpaymentcontrol.models.entities.Customer;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class StoreDto {
  private Customer customer;

  @NotEmpty
  private String name;

  @NotEmpty
  private String ownerName;
  private String location;
  private String number;
}
