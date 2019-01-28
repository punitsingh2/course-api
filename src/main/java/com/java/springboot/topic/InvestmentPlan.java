package com.java.springboot.topic;

import java.util.List;

public class InvestmentPlan {
	
	private String name;
	
	private String monthDate;
	
	List<CreditHistory> creditHistoryList;
	
	

	public InvestmentPlan(String name, String monthDate, List<CreditHistory> creditHistoryList) {
		super();
		this.name = name;
		this.monthDate = monthDate;
		this.creditHistoryList = creditHistoryList;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMonthDate() {
		return monthDate;
	}

	public void setMonthDate(String monthDate) {
		this.monthDate = monthDate;
	}

	public List<CreditHistory> getCreditHistoryList() {
		return creditHistoryList;
	}

	public void setCreditHistoryList(List<CreditHistory> creditHistoryList) {
		this.creditHistoryList = creditHistoryList;
	}
	
	

}
