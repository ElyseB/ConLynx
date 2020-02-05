package com.Lynx.ConLynx.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.Lynx.ConLynx.domain.Paper;
import com.Lynx.ConLynx.domain.PaperMapper;

@Component
public class PaperDAO {
	@Autowired
	PaperMapper paperMapper;

	public PaperDAO() {

	}

	public List<Paper> getPaperList() {
		List<Paper> paperList = new ArrayList<Paper>();
		paperList = paperMapper.getPaperList();
		return paperList;
	}
	
	public List<Paper> getMyPaperList(Paper paper) {
		List<Paper> myPaperList = new ArrayList<Paper>();
		myPaperList = paperMapper.getMyPaperList(paper);
		return myPaperList;
	}
	public void insertPaper(Paper paper) {
		paperMapper.insertPaper(paper);
	}

	public Paper getPaper(Paper paper) {
		// TODO Auto-generated method stub
		return paperMapper.getPaper(paper);
	}

	public void updatePaper(Paper paper) {
		paperMapper.updatePaper(paper);
	}
	
	public Paper getMyPaper(Paper paper) {
		return paperMapper.getMyPaper(paper);
	}

}
