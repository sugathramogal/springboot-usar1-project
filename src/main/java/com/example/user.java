package com.example;


public class user {
	
	private int id;
	private String name;
	private String role;
	private String Company;
	
	public user(int id, String name, String role, String company) {
		super();
		this.id = id;
		this.name = name;
		this.role = role;
		Company = company;
	}
	public user() {}
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
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getCompany() {
		return Company;
	}
	public void setCompany(String company) {
		Company = company;
	}
	
	

}
