package com.Lynx.ConLynx.domain;

public class Paper {
	private int paperid;
	private String title;
	private String filename;
	private String contactauthoremail;
	private String ABSTRACT;

	/**
	 * @param paperid
	 * @param title
	 * @param filename
	 * @param contactauthoremail
	 * @param ABSTRACT
	 */

	public Paper(int paperid, String title, String filename, String contactauthoremail, String ABSTRACT) {
		super();
		this.paperid = paperid;
		this.title = title;
		this.filename = filename;
		this.contactauthoremail = contactauthoremail;
		this.ABSTRACT = ABSTRACT;
	}

	public Paper() {
		// TODO Auto-generated constructor stub
	}

	public int getPaperid() {
		return paperid;
	}

	public void setPaperid(int paperid) {
		this.paperid = paperid;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

	public String getContactauthoremail() {
		return contactauthoremail;
	}

	public void setContactauthoremail(String contactauthoremail) {
		this.contactauthoremail = contactauthoremail;
	}

	public String getAbstract() {
		return ABSTRACT;
	}

	public void setAbstract(String ABSTRACT) {
		this.ABSTRACT = ABSTRACT;
	}

	@Override
	public String toString() {
		return "paper [paperid=" + paperid + ", title=" + title + ", filename=" + filename + ", contactauthoremail="
				+ contactauthoremail + ", ABSTRACT=" + ABSTRACT + "]";
	}

}
