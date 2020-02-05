package com.Lynx.ConLynx.domain;

public class Writes {
	private int paperid;
	private String email;

	/**
	 * @param paperid
	 * @param email
	 */

	public Writes(int paperid, String email) {
		super();
		this.paperid = paperid;
		this.email = email;
	}

	public Writes() {
		// TODO Auto-generated constructor stub
	}

	public int getPaperid() {
		return paperid;
	}

	public void setPaperid(int paperid) {
		this.paperid = paperid;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "writes [paperid=" + paperid + ", email=" + email + "]";
	}

}
