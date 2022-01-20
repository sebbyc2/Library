package com.qa.items;

import com.qa.Interfaces.PaperBased;

public class Book extends LibraryItem implements PaperBased {

	private String genre;
	private String author;
	private int chapters;

	public Book(String name, int fee, String genre, String author, int chapters) {
		super(name, fee);
		this.setGenre(genre);
		this.setAuthor(author);
		this.setChapters(chapters);
	}

	public String getGenre() {
		return this.genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getAuthor() {
		return this.author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getChapters() {
		return this.chapters;
	}

	public void setChapters(int chapter) {
		this.chapters = chapter;
	}

	@Override
	public String annotate(String annotation) {
		return "You annotated " + this.getName() + " with: " + annotation;
	}

	@Override
	public String photoCopy() {
		return "You have created yourself a copy of " + this.getName();
	}

	@Override
	public String throwIt() {
		return "those Youtube reviews lied to you this book is ass, throws it across the room";

	}

}