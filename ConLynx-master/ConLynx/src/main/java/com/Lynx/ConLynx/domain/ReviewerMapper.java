package com.Lynx.ConLynx.domain;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.Lynx.ConLynx.domain.Reviewer;

@Mapper
public interface ReviewerMapper {
	@Select("SELECT email FROM reviewer")
	List<Reviewer> getReviewerList();

	@Select("SELECT email FROM reviewer where email = #{email}")
	List<Reviewer> getMyReviewerList();

	@Select("SELECT email FROM reviewer where email = #{email}")
	Reviewer getReviewer(Reviewer reviewer);

	@Select("SELECT * FROM reviewer where email = #{email}")
	Reviewer getMyReviewer(Reviewer reviewer);

	@Update("update email set email = #{email} where email = #{email}")
	void updateReviewer(Reviewer reviewer);

	@Insert("insert into reviewer(email) values (#{email})")
	void insertReviewer(Reviewer reviewer);

}
