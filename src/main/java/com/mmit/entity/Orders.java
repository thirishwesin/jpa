package com.mmit.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.*;
import static javax.persistence.TemporalType.DATE;


@Entity

public class Orders implements Serializable {

	@Id
	private int id;
	private int totalQty;
	private int totalAmt;

	@Temporal(DATE)
	private Date order_date;

	
	private static final long serialVersionUID = 1L;
	
	@OneToMany(mappedBy = "order")
	private List<OrderDetail>orderdetails;

	public List<OrderDetail> getOrderdetails() {
		return orderdetails;
	}


	public void setOrderdetails(List<OrderDetail> orderdetails) {
		this.orderdetails = orderdetails;
	}


	public Orders() {
		super();
	}

	
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getTotalQty() {
		return this.totalQty;
	}

	public void setTotalQty(int totalQty) {
		this.totalQty = totalQty;
	}

	public int getTotalAmt() {
		return this.totalAmt;
	}

	public void setTotalAmt(int totalAmt) {
		this.totalAmt = totalAmt;
	}

	public Date getOrder_date() {
		return this.order_date;
	}

	public void setOrder_date(Date order_date) {
		this.order_date = order_date;
	}

}
