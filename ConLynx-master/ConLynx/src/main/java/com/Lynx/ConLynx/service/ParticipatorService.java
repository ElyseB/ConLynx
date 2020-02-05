package com.Lynx.ConLynx.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.Lynx.ConLynx.dao.ParticipatorDAO;
import com.Lynx.ConLynx.domain.Participator;

@Component
public class ParticipatorService {

	@Autowired
	ParticipatorDAO participatorDAO;
	
	public ParticipatorService() {
		
	}
	public List<Participator> getParticipatorList(){
		List<Participator> participatorList = new ArrayList <Participator>();
		participatorList = participatorDAO.getParticipatorList();
		return participatorList;
	}
	public void insertParticipator(Participator participator) {
		participatorDAO.insertParticipator(participator);
	}
	public Participator getParticipator(Participator participator) {
		return participatorDAO.getParticipator(participator);
	}
	public void updateParticipator(Participator participator) {
		participatorDAO.updateParticipator(participator);
	}
	public Participator logInParticipator(Participator participator) {
		return participatorDAO.logInParticipator(participator);
	}
}
