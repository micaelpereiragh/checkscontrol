package com.api.checkpaymentcontrol.models.entities;

import com.api.checkpaymentcontrol.commons.entities.BaseEntity;
import com.api.checkpaymentcontrol.models.enums.CheckPaymentStatus;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.io.Serializable;
import java.time.Instant;
import java.util.UUID;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.SoftDelete;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
@NoArgsConstructor
@SoftDelete
@Table(name = "check_update")
public class CheckPaymentUpdate extends BaseEntity implements Serializable {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "check_update_id")
  private UUID checkUpdateId;

  @ManyToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "check_id")
  private CheckPayment check;

  @Column(name = "status", nullable = false)
  @Enumerated
  private CheckPaymentStatus status;

  @Column(name = "reason")
  private String reason;

  @Column(name = "expiration_date")
  private Instant expirationDate;

}
