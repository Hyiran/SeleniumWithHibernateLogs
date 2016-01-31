package com.one.hib;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TEST_CASES")
public class TestCase {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@Column(name = "NUMBER")
	private int number;

	@Column(name = "NAME")
	private String name;

	@Column(name = "SUITE_ID")
	private int suite_id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSuite_id() {
		return suite_id;
	}

	public void setSuite_id(int suite_id) {
		this.suite_id = suite_id;
	}
}
