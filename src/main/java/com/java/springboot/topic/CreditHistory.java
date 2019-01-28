package com.java.springboot.topic;

import java.math.BigDecimal;

public class CreditHistory {
	
	private BigDecimal amount;
	
	private String creditDate;
	
	

	public CreditHistory(BigDecimal amount, String creditDate) {
		super();
		this.amount = amount;
		this.creditDate = creditDate;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public String getCreditDate() {
		return creditDate;
	}

	public void setCreditDate(String creditDate) {
		this.creditDate = creditDate;
	}
	
	

}
