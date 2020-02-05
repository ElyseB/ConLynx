package com.Lynx.ConLynx.dao;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.Lynx.ConLynx.domain.Author;
import com.Lynx.ConLynx.domain.AuthorMapper;
import com.Lynx.ConLynx.domain.Paper;
import com.Lynx.ConLynx.domain.PaperMapper;
import com.Lynx.ConLynx.domain.Participator;
import com.Lynx.ConLynx.domain.ParticipatorMapper;
import com.Lynx.ConLynx.domain.Writes;
import com.Lynx.ConLynx.domain.WritesMapper;


@Component
public class WritesDAO {

	@Autowired
	WritesMapper writesMapper;
	
	public WritesDAO() {
		
	}
	public List<Writes> getWritesList(){
		List<Writes> writesList = new ArrayList<Writes>();
		writesList = writesMapper.getWritesList();
		return writesList;
	}
	public void insertWrites(Writes writes) {
		writesMapper.insertWrites(writes);
	}
	public Writes getWrites(Writes writes) {
		return writesMapper.getWrites(writes);
	}
	public void updateWrites(Writes writes) {
		writesMapper.updateWrites(writes);
	}
}
