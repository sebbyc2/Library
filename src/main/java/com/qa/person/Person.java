package com.qa.person;

public class Person {

	private static int id_counter = 0;
	private int id;
	private String name;
	private int debt;

	public Person(String name) {
		super();
		this.id = id_counter;
		id_counter++;
		this.name = name;
		this.debt = 0;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", debt=" + debt + "]";

	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDebt() {
		return debt;
	}

	public void setDebt(int debt) {
		this.debt = debt;
	}

}
