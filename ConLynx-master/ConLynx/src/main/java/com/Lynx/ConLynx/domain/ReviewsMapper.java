package com.Lynx.ConLynx.domain;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface ReviewsMapper {

	@Select("SELECT revemail, paperid, techmerit, readability, originality, relavance, overallrecomm, commentforcommittee, commentforauthor FROM reviews")
	List<Reviews> getReviewsList();

	@Select("SELECT * FROM reviews where revemail = #{revemail}")
	List<Reviews> getMyReviewsList(Reviews reviews);
	
	@Select("SELECT * FROM reviews where paperid = #{paperid}")
	List<Reviews> getReviewsByPaperIDList(Reviews reviews);

	@Select("SELECT revemail, paperid, techmerit, readability, originality, relavance, overallrecomm, commentforcommittee, commentforauthor FROM reviews where revemail = #{revemail}")
	Reviews getReviews(Reviews reviews);

	@Select("SELECT * FROM reviews where revemail = #{revemail} and rownum <=1")
	Reviews getMyReviews(Reviews reviews);
	
	@Select("SELECT * FROM reviews where paperid = #{paperid} and rownum <=1")
	Reviews getReviewsByPaperID(Reviews reviews);

	@Update("update reviews set paperid = #{paperid}, techmerit = #{techmerit}, readability = #{readability}, originality = #{originality}, relavance = #{relavance}, overallrecomm = #{overallrecomm}, commentforcommittee = #{commentforcommittee}, commentforauthor = #{commentforauthor} where revemail = #{revemail}")
	void updateReviews(Reviews reviews);

	@Insert("insert into reviews(revemail, paperid, techmerit, readability, originality, relavance, overallrecomm, commentforcommittee, commentforauthor) values (#{revemail}, #{paperid}, #{techmerit}, #{readability}, #{originality}, #{relavance}, #{overallrecomm}, #{commentforcommittee}, #{commentforauthor})")
	void insertReviews(Reviews reviews);
}
