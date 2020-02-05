package com.Lynx.ConLynx.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.Lynx.ConLynx.dao.Topics_of_interestsDAO;
import com.Lynx.ConLynx.domain.Topics_of_interests;

@Component
public class Topics_of_interestsService {
	
	@Autowired
	Topics_of_interestsDAO topics_of_interestsDAO;
	
	public Topics_of_interestsService() {
		
	}
	public List<Topics_of_interests> getTopics_of_interestsList(){
		List<Topics_of_interests> topics_of_interestsList = new ArrayList<Topics_of_interests>();
		topics_of_interestsList = topics_of_interestsDAO.getTopics_of_interestsList();
		return topics_of_interestsList;
	}
	public void insertTopics_of_interests(Topics_of_interests topics_of_interests) {
		topics_of_interestsDAO.insertTopics_of_interests(topics_of_interests);
	}
	public Topics_of_interests getTopics_of_interests(Topics_of_interests topics_of_interests) {
		return topics_of_interestsDAO.getTopics_of_interests(topics_of_interests);
	}
	public void updateTopics_of_interests(Topics_of_interests topics_of_interests) {
		topics_of_interestsDAO.updateTopics_of_interests(topics_of_interests);
	}
}
