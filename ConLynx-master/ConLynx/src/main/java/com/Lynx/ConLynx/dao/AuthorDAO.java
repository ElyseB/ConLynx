package com.Lynx.ConLynx.dao;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.Lynx.ConLynx.domain.Author;
import com.Lynx.ConLynx.domain.AuthorMapper;

@Component
public class AuthorDAO {

	@Autowired
	AuthorMapper authorMapper;
	
	public AuthorDAO() {
		
	}
	public List<Author> getAuthorList(){
		List<Author> authorList = new ArrayList<Author>();
		authorList = authorMapper.getAuthorList();
		return authorList;
	}
	public void insertAuthor(Author author) {
		authorMapper.insertAuthor(author);
	}
	public Author getAuthor(Author author) {
		return authorMapper.getAuthor(author);
	}
	public void updateAuthor(Author author) {
		authorMapper.updateAuthor(author);
	}
}
