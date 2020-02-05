package com.Lynx.ConLynx.domain;

import java.sql.Date;

public class Topics_of_interests {
	private String revemail;
	private String topic;
	
	/**
	 * @param revemail
	 * @parem topic
	 */
	
	
	
	public Topics_of_interests(String revemail, String topic) {
		super();
		this.revemail = revemail;
		this.topic = topic;
	}

	public Topics_of_interests() {
		// TODO Auto-generated constructor stub
	}

	public String getRevemail() {
		return revemail;
	}

	public void setRevemail(String revemail) {
		this.revemail = revemail;
	}

	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

	@Override
	public String toString() {
		return "topics_of_interests [revemail=" + revemail + ", topic=" + topic + "]";
	}

	
	
}
