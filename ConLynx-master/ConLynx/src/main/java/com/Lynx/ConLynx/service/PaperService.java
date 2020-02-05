package com.Lynx.ConLynx.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.Lynx.ConLynx.dao.PaperDAO;
import com.Lynx.ConLynx.domain.Paper;

@Component
public class PaperService {

	@Autowired
	PaperDAO paperDAO;

	public PaperService() {

	}

	public List<Paper> getPaperList() {
		List<Paper> paperList = new ArrayList<Paper>();
		paperList = paperDAO.getPaperList();
		return paperList;
	}

	public List<Paper> getMyPaperList(Paper paper){
		List<Paper> myPaperList = new ArrayList<Paper>();
		myPaperList = paperDAO.getMyPaperList(paper);
		return myPaperList;
	}
	public void insertPaper(Paper paper) {
		paperDAO.insertPaper(paper);
	}

	public Paper getPaper(Paper paper) {
		return paperDAO.getPaper(paper);
	}

	public void updatePaper(Paper paper) {
		paperDAO.updatePaper(paper);
	}
	public Paper getMyPaper(Paper paper) {
		return paperDAO.getMyPaper(paper);
	}

}
