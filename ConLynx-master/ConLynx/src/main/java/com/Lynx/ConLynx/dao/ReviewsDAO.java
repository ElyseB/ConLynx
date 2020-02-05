package com.Lynx.ConLynx.dao;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.Lynx.ConLynx.domain.Paper;
import com.Lynx.ConLynx.domain.Reviews;
import com.Lynx.ConLynx.domain.ReviewsMapper;

@Component
public class ReviewsDAO {

	@Autowired
	ReviewsMapper reviewsMapper;

	public ReviewsDAO() {

	}

	public List<Reviews> getReviewsList() {
		List<Reviews> reviewsList = new ArrayList<Reviews>();
		reviewsList = reviewsMapper.getReviewsList();
		return reviewsList;
	}

	public List<Reviews> getMyReviewsList(Reviews reviews) {
		List<Reviews> myReviewsList = new ArrayList<Reviews>();
		myReviewsList = reviewsMapper.getMyReviewsList(reviews);
		return myReviewsList;
	}
	
	public List<Reviews> getReviewsByPaperIDList(Reviews reviews) {
		List<Reviews> ReviewsByPaperIDList = new ArrayList<Reviews>();
		ReviewsByPaperIDList = reviewsMapper.getReviewsByPaperIDList(reviews);
		return ReviewsByPaperIDList;
	}
	
	public Reviews getReviewsByPaperID(Reviews reviews) {
		return reviewsMapper.getReviewsByPaperID(reviews);
	}

	public void insertReviews(Reviews reviews) {
		reviewsMapper.insertReviews(reviews);
	}

	public Reviews getReviews(Reviews reviews) {
		return reviewsMapper.getReviews(reviews);
	}

	public void updateReviews(Reviews reviews) {
		reviewsMapper.updateReviews(reviews);
	}

	public Reviews getMyReviews(Reviews reviews) {
		return reviewsMapper.getMyReviews(reviews);
	}
}
