package com.Lynx.ConLynx.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.Lynx.ConLynx.domain.Participator;
import com.Lynx.ConLynx.domain.ParticipatorMapper;

@Component
public class ParticipatorDAO {
	@Autowired
	ParticipatorMapper participatorMapper;

	public ParticipatorDAO() {

	}

	public List<Participator> getParticipatorList() {
		List<Participator> participatorList = new ArrayList<Participator>();
		participatorList = participatorMapper.getParticipatorList();
		return participatorList;
	}

	public void insertParticipator(Participator participator) {
		participatorMapper.insertParticipator(participator);
	}

	public Participator getParticipator(Participator participator) {
		// TODO Auto-generated method stub
		return participatorMapper.getParticipator(participator);
	}

	public void updateParticipator(Participator participator) {
		participatorMapper.updateParticipator(participator);
	}

	public Participator logInParticipator(Participator participator) {
		return participatorMapper.logInParticipator(participator);
	}

}
