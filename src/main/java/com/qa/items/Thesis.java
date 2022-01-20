package com.qa.items;

import java.util.ArrayList;
import java.util.List;

import com.qa.Interfaces.PaperBased;

public class Thesis extends LibraryItem implements PaperBased {

	//

	private String author;
	private String topic;
	private List<String> annotationsList = new ArrayList<String>();
	// Constructor

	public Thesis(String name, int fee, String author, String topic) {
		super(name, fee);
		this.setAuthor(author);
		this.setTopic(topic);
	}

	// Paper Based interface methods

	public String annotate(String annotation) {
		this.getAnnotationsList().add(annotation);
		return "You annotate \"" + this.getName() + "\", with: " + annotation;
	}

	public String photoCopy() {
		return "You make a copy of \'" + this.getName() + "\'";
	}

	// Abstract method throwIt();

	@Override
	public void throwIt() {
		System.out.println("You cannot comprehent the thesis. You throw " + this.getName() + " in anger.");
	}

	// toString

	public String toString() {
		return "Thesis \'" + this.getName() + "\' by " + this.getAuthor() + ". Field of concern: " + this.getTopic()
				+ " . Late fee: " + this.getFee();
	}

	// Getters & setters

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

	public List<String> getAnnotationsList() {
		return annotationsList;
	}

	public void setAnnotationsList(List<String> annotationsList) {
		this.annotationsList = annotationsList;
	}

}
