package com.Lynx.ConLynx.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.Lynx.ConLynx.dao.ReviewerDAO;
import com.Lynx.ConLynx.domain.Reviewer;

@Component
public class ReviewerService {

	@Autowired
	ReviewerDAO reviewerDAO;

	public ReviewerService() {

	}

	public List<Reviewer> getReviewerList() {
		List<Reviewer> reviewerList = new ArrayList<Reviewer>();
		reviewerList = reviewerDAO.getReviewerList();
		return reviewerList;
	}

	public void insertReviewer(Reviewer reviewer) {
		reviewerDAO.insertReviewer(reviewer);
	}

	public Reviewer getReviewer(Reviewer reviewer) {
		return reviewerDAO.getReviewer(reviewer);
	}

	public void updateReviewer(Reviewer reviewer) {
		reviewerDAO.updateReviewer(reviewer);
	}
}
