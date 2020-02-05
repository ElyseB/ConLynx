package com.Lynx.ConLynx.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.Lynx.ConLynx.dao.WritesDAO;
import com.Lynx.ConLynx.domain.Writes;

@Component
public class WritesService {
	
	@Autowired
	WritesDAO writesDAO;
	
	public WritesService() {
		
	}
	public List<Writes> getWritesList(){
		List<Writes> writesList = new ArrayList<Writes>();
		writesList = writesDAO.getWritesList();
		return writesList;
	}
	public void insertWrites(Writes writes) {
		writesDAO.insertWrites(writes);
	}
	public Writes getWrites(Writes writes) {
		return writesDAO.getWrites(writes);
	}
	public void updateWrites(Writes writes) {
		writesDAO.updateWrites(writes);
	}
}
