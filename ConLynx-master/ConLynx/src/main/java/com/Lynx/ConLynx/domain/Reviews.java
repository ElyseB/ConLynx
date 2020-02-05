package com.Lynx.ConLynx.domain;

public class Reviews {
	private String revemail;
	private int paperid;
	private int techmerit;
	private int readability;
	private int originality;
	private int relavance;
	private int overallrecomm;
	private String commentforcommittee;
	private String commentforauthor;
	
	/**
	 * @param revemail
	 * @param paperid
	 * @param techmerit
	 * @param readability
	 * @param originality
	 * @parem relavance
	 * @parem overallrecomm;
	 * @parem commentforcommittee
	 * @parem commentforauthor
	 */
	
	public Reviews(String revemail, int paperid, int techmerit, int readability, int originality, int relavance,
			int overallrecomm, String commentforcommittee, String commentforauthor) {
		super();
		this.revemail = revemail;
		this.paperid = paperid;
		this.techmerit = techmerit;
		this.readability = readability;
		this.originality = originality;
		this.relavance = relavance;
		this.overallrecomm = overallrecomm;
		this.commentforcommittee = commentforcommittee;
		this.commentforauthor = commentforauthor;
	}

	public Reviews() {
		// TODO Auto-generated constructor stub
	}

	public String getRevemail() {
		return revemail;
	}

	public void setRevemail(String revemail) {
		this.revemail = revemail;
	}

	public int getPaperid() {
		return paperid;
	}

	public void setPaperid(int paperid) {
		this.paperid = paperid;
	}

	public int getTechmerit() {
		return techmerit;
	}

	public void setTechmerit(int techmerit) {
		this.techmerit = techmerit;
	}

	public int getReadability() {
		return readability;
	}

	public void setReadability(int readability) {
		this.readability = readability;
	}

	public int getOriginality() {
		return originality;
	}

	public void setOriginality(int originality) {
		this.originality = originality;
	}

	public int getRelavance() {
		return relavance;
	}

	public void setRelavance(int relavance) {
		this.relavance = relavance;
	}

	public int getOverallrecomm() {
		return overallrecomm;
	}

	public void setOverallrecomm(int overallrecomm) {
		this.overallrecomm = overallrecomm;
	}

	public String getCommentforcommittee() {
		return commentforcommittee;
	}

	public void setCommentforcommittee(String commentforcommittee) {
		this.commentforcommittee = commentforcommittee;
	}

	public String getCommentforauthor() {
		return commentforauthor;
	}

	public void setCommentforauthor(String commentforauthor) {
		this.commentforauthor = commentforauthor;
	}
	
}



