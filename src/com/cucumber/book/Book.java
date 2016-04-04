/**
 * 
 */
package com.cucumber.book;

import java.util.Date;

/**
 * @author Lochana
 *
 */
public class Book {
	private String title;
	private String author;
	private Date published;

	public Book(String title, String author, Date published) {
		this.title = title;
		this.author = author;
		this.published = published;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title
	 *            the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return the author
	 */
	public String getAuthor() {
		return author;
	}

	/**
	 * @param author
	 *            the author to set
	 */
	public void setAuthor(String author) {
		this.author = author;
	}

	/**
	 * @return the published
	 */
	public Date getPublished() {
		return published;
	}

	/**
	 * @param published
	 *            the published to set
	 */
	public void setPublished(Date published) {
		this.published = published;
	}

}
