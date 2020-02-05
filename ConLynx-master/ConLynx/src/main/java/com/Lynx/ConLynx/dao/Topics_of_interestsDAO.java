package com.Lynx.ConLynx.dao;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.Lynx.ConLynx.domain.Topics_of_interests;
import com.Lynx.ConLynx.domain.Topics_of_interestsMapper;

@Component
public class Topics_of_interestsDAO {

	@Autowired
	Topics_of_interestsMapper topics_of_interestsMapper;
	
	public Topics_of_interestsDAO() {
		
	}
	public List<Topics_of_interests> getTopics_of_interestsList(){
		List<Topics_of_interests> topics_of_interestsList = new ArrayList<Topics_of_interests>();
		topics_of_interestsList = topics_of_interestsMapper.getTopics_of_interestsList();
		return topics_of_interestsList;
	}
	public void insertTopics_of_interests(Topics_of_interests topics_of_interests) {
		topics_of_interestsMapper.insertTopics_of_interests(topics_of_interests);
	}
	public Topics_of_interests getTopics_of_interests(Topics_of_interests topics_of_interests) {
		return topics_of_interestsMapper.getTopics_of_interests(topics_of_interests);
	}
	public void updateTopics_of_interests(Topics_of_interests topics_of_interests) {
		topics_of_interestsMapper.updateTopics_of_interests(topics_of_interests);
	}
}
