package com.Lynx.ConLynx.domain;

import java.sql.Date;

public class Author {
	private String email;

	/**
	 * @param email
	 */

	public Author(String email) {
		super();
		this.email = email;
	}

	public Author() {
		// TODO Auto-generated constructor stub
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "author [email=" + email + "]";
	}

}
