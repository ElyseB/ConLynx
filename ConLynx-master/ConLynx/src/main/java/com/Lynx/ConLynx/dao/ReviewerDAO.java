package com.Lynx.ConLynx.dao;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.Lynx.ConLynx.domain.Paper;
import com.Lynx.ConLynx.domain.Reviewer;
import com.Lynx.ConLynx.domain.Reviewer;
import com.Lynx.ConLynx.domain.ReviewerMapper;

@Component
public class ReviewerDAO {

	@Autowired
	ReviewerMapper reviewerMapper;

	public ReviewerDAO() {

	}

	public List<Reviewer> getReviewerList() {
		List<Reviewer> reviewerList = new ArrayList<Reviewer>();
		reviewerList = reviewerMapper.getReviewerList();
		return reviewerList;
	}

	public void insertReviewer(Reviewer reviewer) {
		reviewerMapper.insertReviewer(reviewer);
	}

	public Reviewer getReviewer(Reviewer reviewer) {
		// TODO Auto-generated method stub
		return reviewerMapper.getReviewer(reviewer);
	}

	public void updateReviewer(Reviewer reviewer) {
		reviewerMapper.updateReviewer(reviewer);
	}
}
