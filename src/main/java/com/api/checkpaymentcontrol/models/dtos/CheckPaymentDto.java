package com.api.checkpaymentcontrol.models.dtos;

import jakarta.validation.constraints.FutureOrPresent;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Positive;
import java.time.Instant;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CheckPaymentDto {

  @NotEmpty
  private String customerId;

  @NotEmpty
  private Long checkNumber;

  @Positive
  private Double amount;

  @FutureOrPresent
  @Positive
  private Instant issuanceDate;
}
