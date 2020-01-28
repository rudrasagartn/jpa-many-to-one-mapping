package com.springboot.jpa.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "order_line")
@Getter @Setter
public class OrderLine {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer orderLineId;
	
	@Column(name="order_line_name")
	private String orderLineName;

	@ManyToOne
	@JoinColumn(name = "order_id")
	private Order order;
	
	@Override
	public String toString() {
		return getOrderLineId() + " - "+getOrderLineName();
	}

	
}
