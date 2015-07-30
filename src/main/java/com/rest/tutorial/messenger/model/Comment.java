package com.rest.tutorial.messenger.model;

import java.util.Date;

public class Comment {
	
	private long id;
	private String comment;
	private Date date;
	private String author;
	
	public Comment() {
		
	}

	public Comment(long id, String comment, String author) {
		super();
		this.id = id;
		this.comment = comment;
		this.author = author;
		this.date = new Date();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
}
