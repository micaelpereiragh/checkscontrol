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
import jakarta.persistence.Table;
import java.io.Serializable;
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
@Table(name = "store")
public class Store extends BaseEntity implements Serializable {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "store_id")
  private UUID storeId;

  @ManyToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "customer_id")
  private Customer customer;

  @Column(name = "name", nullable = false)
  private String name;

  @Column(name = "owner_name", nullable = false)
  private String ownerName;

  @Column(name = "location")
  private String location;

  @Column(name = "number")
  private String number;

}
