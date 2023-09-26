package com.example.accessingdatajpa.entity;

import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name="orders_products")
public class OrderProduct {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY )
	private Long id;
	@Column(name = "purchase_date" , columnDefinition = "timestamp default CURRENT_TIMESTAMP"  )
	private Timestamp purchaseDate;
	@Column(name = "total_amount")
	private double totalAmount;
	@ManyToOne
	@JoinColumn(name = "fk_customer_id" )
	@JsonIgnoreProperties("orders")
	private Customer customer;

}
