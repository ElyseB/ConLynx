package com.Lynx.ConLynx.domain;

public class Reviewer {
	private String email;
	
	/**
	 * @param email
	 */

	public Reviewer(String email) {
		super();
		this.email = email;
	}

	public Reviewer() {
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
		return "reviewer [email=" + email + "]";
	}

}
