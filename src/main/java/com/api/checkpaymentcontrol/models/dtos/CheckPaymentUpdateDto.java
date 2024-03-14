package com.api.checkpaymentcontrol.models.dtos;

import com.api.checkpaymentcontrol.models.enums.CheckPaymentStatus;
import jakarta.validation.constraints.NotEmpty;
import java.time.Instant;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CheckPaymentUpdateDto {

  @NotEmpty
  private String checkId;

  @NotEmpty
  private CheckPaymentStatus status;
  private String reason;
  private Instant expirationDate;
}
