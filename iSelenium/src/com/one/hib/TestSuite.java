package com.one.hib;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "test_sutie")
public class TestSuite {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@Column(name = "number")
	private int suite_number;

	@Column(name = "NAME")
	private String suite_name;

	@Column(name = "TEST_CASE_ID")
	private int test_case_id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSuite_number() {
		return suite_number;
	}

	public void setSuite_number(int suite_number) {
		this.suite_number = suite_number;
	}

	public String getSuite_name() {
		return suite_name;
	}

	public void setSuite_name(String suite_name) {
		this.suite_name = suite_name;
	}

	public int getTest_case_id() {
		return test_case_id;
	}

	public void setTest_case_id(int test_case_id) {
		this.test_case_id = test_case_id;
	}

	public int getReport_id() {
		return report_id;
	}

	public void setReport_id(int report_id) {
		this.report_id = report_id;
	}

	@Column(name = "RESULT_ID")
	private int report_id;

}
