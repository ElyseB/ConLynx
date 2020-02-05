package com.Lynx.ConLynx.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.Lynx.ConLynx.dao.AuthorDAO;
import com.Lynx.ConLynx.domain.Author;

@Component
public class AuthorService {

	@Autowired
	AuthorDAO authorDAO;

	public AuthorService() {

	}

	public List<Author> getAuthorList() {
		List<Author> authorList = new ArrayList<Author>();
		authorList = authorDAO.getAuthorList();
		return authorList;
	}

	public void insertAuthor(Author author) {
		authorDAO.insertAuthor(author);
	}

	public Author getAuthor(Author author) {
		return authorDAO.getAuthor(author);
	}

	public void updateAuthor(Author author) {
		authorDAO.updateAuthor(author);
	}
}
