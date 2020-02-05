package com.Lynx.ConLynx.domain;

import java.util.List;

import javax.validation.constraints.Email;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface AuthorMapper {
	@Select("SELECT email FROM author")
	List<Author> getAuthorList();
	
	@Select("SELECT email FROM author where email = #{email}")
	Author getAuthor(Author author);
	
	@Update("update email set email = #{email} where email = #{email}")
	void updateAuthor(Author author);
	
	@Insert("insert into author(email) values (#{email})")
	void insertAuthor(Author author);
}
