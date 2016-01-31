package com.pers.db;

public class Result {

	public Result(String name, String result, int id) {
		this.name = name;
		this.result = result;
		this.id = id;
	}

	public Result() {
		// TODO Auto-generated constructor stub
	}

	int id;
	String name;

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

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	String result;

}
