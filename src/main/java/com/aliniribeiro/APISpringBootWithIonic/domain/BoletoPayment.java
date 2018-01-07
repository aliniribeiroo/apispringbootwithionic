package com.aliniribeiro.APISpringBootWithIonic.domain;

import java.util.Date;

import javax.persistence.Entity;

import com.aliniribeiro.APISpringBootWithIonic.domain.enums.PaymentState;

@Entity
public class BoletoPayment extends Payment {

	private static final long serialVersionUID = 1L;

	private Date validDate;
	private Date paymentDate;

	public BoletoPayment() {

	}

	public BoletoPayment(Integer id, PaymentState state, Order order, Date validDate, Date paymentDate) {
		super(id, state, order);
		this.validDate = validDate;
		this.paymentDate = paymentDate;
	}

	public Date getValidDate() {
		return validDate;
	}

	public void setValidDate(Date validDate) {
		this.validDate = validDate;
	}

	public Date getPaymentDate() {
		return paymentDate;
	}

	public void setPaymentDate(Date paymentDate) {
		this.paymentDate = paymentDate;
	}

}
