package com.learn.scratch.dto;

public class StudentDTO {

	private int id;

	private String name;

	private long number;

	private String email;

	public StudentDTO() {
		
	}
	
	public StudentDTO(int id, String name, long number, String email) {
		super();
		this.id = id;
		this.name = name;
		this.number = number;
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getNumber() {
		return number;
	}

	public void setNumber(long number) {
		this.number = number;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "StudentDTO [id=" + id + ", name=" + name + ", number=" + number + ", email=" + email + "]";
	}

	
}
