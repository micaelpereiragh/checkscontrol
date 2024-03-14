package com.api.checkpaymentcontrol.models.dtos;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import java.util.Set;
import java.util.UUID;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CustomerDto {

  private Set<StoreDto> stores;

  private Set<CheckPaymentDto> checks;

  private UUID customerId;

  @NotEmpty(message = "Name is a required field.")
  private String name;

  @Email
  private String email;

  private String address;

  @NotEmpty(message = "PhoneNumber is a required field.")
  private String phoneNumber;

  private String postalCode;

  private String notes;
}
