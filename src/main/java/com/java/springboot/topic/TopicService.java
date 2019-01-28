package com.java.springboot.topic;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	
	private List<Topic> topics =  new ArrayList<Topic>(Arrays.asList(
			new Topic(1,"Spring","Spring framework"),
			new Topic(2,"Strts","Struts framework")
			));
	
	
	private List<CreditHistory> creditHistory =  new ArrayList<CreditHistory>(Arrays.asList(
			new CreditHistory(new BigDecimal(20),"2018-03-01 09:10:30"),
			new CreditHistory(new BigDecimal(20),"2018-03-04 09:10:30"),
			new CreditHistory(new BigDecimal(20),"2018-03-07 09:10:30"),
			new CreditHistory(new BigDecimal(20),"2018-03-11 09:10:30"),
			new CreditHistory(new BigDecimal(20),"2018-03-16 09:10:30"),
			new CreditHistory(new BigDecimal(20),"2018-03-20 09:10:30"),
			new CreditHistory(new BigDecimal(20),"2018-03-24 09:10:30"),
			new CreditHistory(new BigDecimal(20),"2018-03-28 09:10:30"),
			new CreditHistory(new BigDecimal(20),"2018-03-31 09:10:30"),
			new CreditHistory(new BigDecimal(20),"2018-04-04 09:10:30")
			));
	
	private InvestmentPlan investmentPlan = new InvestmentPlan("MidCAP", "2018-03-01 09:10:30", creditHistory);
	
	
	
	public List<Topic> getAllTopics(){
		return topics;
	}
	
	public Topic getTopic(final int id){
		return topics.stream().filter(t -> t.getId()==id).findFirst().get();
	}

	public void addTopic(Topic topic) {
		topics.add(topic);
		
	}

	public void updateTopic(int id, Topic topic) {
		for(int i=0; i < topics.size(); i++) {
			Topic t = topics.get(i);
			if(t.getId() == id ) {
				topics.set(i, topic);
			}
		}
		
	}

	public void deleteTopic(int id) {
		topics.removeIf(t -> t.getId()==id);
		
	}

	public InvestmentPlan getInvestmentPlan() {
		return investmentPlan;
		
	}

}
