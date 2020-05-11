package com.poc.library.data.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Book")
public class Book {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	// @Column(name = "title")
	private String title;
	// @Column(name = "cover")
	private String cover;
	// @Column(name = "publisher")
	private String publisher;
	// @Column(name = "pages")
	private String pages;
	// @Column(name = "available")
	private String available;

	public Book() {

	}

	public Book(String iSBN, String title, String cover, String publisher, String pages, String available) {
		super();
		this.title = title;
		this.cover = cover;
		this.publisher = publisher;
		this.pages = pages;
		this.available = available;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCover() {
		return cover;
	}

	public void setCover(String cover) {
		this.cover = cover;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getPages() {
		return pages;
	}

	public void setPages(String pages) {
		this.pages = pages;
	}

	public String getAvailable() {
		return available;
	}

	public void setAvailable(String available) {
		this.available = available;
	}
}
