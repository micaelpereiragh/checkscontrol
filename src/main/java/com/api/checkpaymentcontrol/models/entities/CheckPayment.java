package com.api.checkpaymentcontrol.models.entities;

import com.api.checkpaymentcontrol.commons.entities.BaseEntity;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.io.Serializable;
import java.time.Instant;
import java.util.Set;
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
@Table(name = "check_payment")
public class CheckPayment extends BaseEntity implements Serializable {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "check_id")
  private UUID checkId;

  @ManyToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "customer_id")
  private Customer customer;

  @OneToMany(mappedBy = "check", cascade = CascadeType.ALL, orphanRemoval = true)
  private Set<CheckPaymentUpdate> checksUpdates;

  @Column(name = "check_number", nullable = false)
  private Long checkNumber;

  @Column(name = "amount", nullable = false)
  private Double amount;

  @Column(name = "issuance_date", nullable = false)
  private Instant issuanceDate;

}
