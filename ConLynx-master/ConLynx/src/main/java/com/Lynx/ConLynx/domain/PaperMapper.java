package com.Lynx.ConLynx.domain;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface PaperMapper {
	@Select("SELECT paperid, title, filename, contactauthoremail, abstract FROM paper")
	List<Paper> getPaperList();
	
	@Select("SELECT * FROM paper where contactauthoremail = #{contactauthoremail}")
	List<Paper> getMyPaperList(Paper paper);

	@Select("SELECT paperid, title, filename, contactauthoremail, abstract FROM paper where paperid = #{paperid}")
	Paper getPaper(Paper paper);
	
	@Select("SELECT * FROM paper WHERE contactauthoremail = #{contactauthoremail} and rownum <= 1")
	Paper getMyPaper(Paper paper);

	@Update("update paper set title = #{title}, filename = #{filename}, contactauthoremail = #{contactauthoremail}, abstract = #{abstract} where paperid = #{paperid}")
	void updatePaper(Paper paper);

	@Insert("insert into paper(paperid, title, filename, contactauthoremail, abstract) values (#{paperid}, #{title}, #{filename}, #{contactauthoremail}, #{abstract})")
	void insertPaper(Paper paper);

}
