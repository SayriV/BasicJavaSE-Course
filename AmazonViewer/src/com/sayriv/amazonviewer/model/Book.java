package com.sayriv.amazonviewer.model;

import java.util.Date;

public class Book {
	private int id;
	private String title;
	private String genre;
	private String [] authors;
	private Date editionDate;
	private String editorial;
	private String isbn;
	private boolean readed;
	private int timeReaded;
	//int numberPages;
	public Book(String title, Date editionDate, String editorial, String isbn) {
		super();
		this.title = title;
		this.editionDate = editionDate;
		this.editorial = editorial;
		this.isbn = isbn;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String[] getAuthors() {
		return authors;
	}
	public void setAuthors(String[] authors) {
		this.authors = authors;
	}
	public Date getEditionDate() {
		return editionDate;
	}
	public void setEditionDate(Date editionDate) {
		this.editionDate = editionDate;
	}
	public String getEditorial() {
		return editorial;
	}
	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public boolean isReaded() {
		return readed;
	}
	public void setReaded(boolean readed) {
		this.readed = readed;
	}
	public int getTimeReaded() {
		return timeReaded;
	}
	public void setTimeReaded(int timeReaded) {
		this.timeReaded = timeReaded;
	}
	
	
	 
}
