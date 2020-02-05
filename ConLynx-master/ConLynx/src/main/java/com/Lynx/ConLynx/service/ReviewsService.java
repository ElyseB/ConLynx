package com.Lynx.ConLynx.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.Lynx.ConLynx.dao.ReviewsDAO;
import com.Lynx.ConLynx.domain.Paper;
import com.Lynx.ConLynx.domain.Reviews;

@Component
public class ReviewsService {

	@Autowired
	ReviewsDAO reviewsDAO;

	public ReviewsService() {

	}

	public List<Reviews> getReviewsList() {
		List<Reviews> reviewsList = new ArrayList<Reviews>();
		reviewsList = reviewsDAO.getReviewsList();
		return reviewsList;
	}

	public List<Reviews> getMyReviewsList(Reviews reviews) {
		List<Reviews> myReviewsList = new ArrayList<Reviews>();
		myReviewsList = reviewsDAO.getMyReviewsList(reviews);
		return myReviewsList;
	}

	public List<Reviews> getReviewsByPaperIDList(Reviews reviews) {
		List<Reviews> ReviewsByPaperIDList = new ArrayList<Reviews>();
		ReviewsByPaperIDList = reviewsDAO.getReviewsByPaperIDList(reviews);
		return ReviewsByPaperIDList;
	}
	
	public Reviews getReviewsByPaperID(Reviews reviews) {
		return reviewsDAO.getReviewsByPaperID(reviews);
	}
	
	public void insertReviews(Reviews reviews) {
		reviewsDAO.insertReviews(reviews);
	}

	public Reviews getReviews(Reviews reviews) {
		return reviewsDAO.getReviews(reviews);
	}

	public void updateReviews(Reviews reviews) {
		reviewsDAO.updateReviews(reviews);
	}

	public Reviews getMyReviews(Reviews reviews) {
		return reviewsDAO.getMyReviews(reviews);
	}
}
