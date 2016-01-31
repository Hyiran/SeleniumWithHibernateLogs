package com.amazon.tests;

import java.util.ArrayList;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.testng.annotations.Test;
import com.amazon.tests.AmazonLogin;
import com.one.hib.Result;
import com.one.hib.TestCase;
import com.one.hib.TestSuite;

public class AmazonLoginTest {
	java.util.List<String> list1 = new ArrayList<String>();
	java.util.List<String> list2 = new ArrayList<String>();

	Logger log = Logger.getLogger(AmazonLoginTest.class.getName());

	Session session = new AnnotationConfiguration().configure().buildSessionFactory().openSession();

	Transaction tx = session.beginTransaction();

	String xpath_start = "//*[@id='nav-xshop']/a[";
	String xpath_end = "]";

	@Test
	public void OpenBrowser() {
		AmazonLogin.OpenBrowser();
	}

	@Test
	public void SearchString() {
		AmazonLogin.SearchString();
	}

	@Test
	public void verifyMenuItem() {
		AmazonLogin.verifyMenuItem();
	}

	@Test
	public void verifyNavXShop() {
		list1.add("Your Amazon.com");
		list1.add("Today's Deals");
		list1.add("Gift Cards");
		list1.add("Sell");
		list1.add("Help");
		AmazonLogin.verifyNavXShop(list1, list2, xpath_start, xpath_end);

	}

	@Test
	public void verifyPageTitle() {
		AmazonLogin.verifyPageTitle();
	}

	@Test
	public void verifyShopByDept() {
		AmazonLogin.verifyShopByDept();

	}

}
