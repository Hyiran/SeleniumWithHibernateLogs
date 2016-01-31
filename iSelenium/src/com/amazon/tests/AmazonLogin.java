package com.amazon.tests;

import java.util.Collections;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.interactions.Actions;

import com.base.packs.Constants;
import com.base.packs.Util;
import com.one.hib.Result;
import com.one.hib.TestCase;
import com.one.hib.TestSuite;

public class AmazonLogin {

	static WebDriver driver;
	static WebElement element;
	static Logger log = Logger.getLogger(AmazonLogin.class.getName());

	static Session session = new AnnotationConfiguration().configure().buildSessionFactory().openSession();

	static Transaction tx = session.beginTransaction();
	static Result r = new Result();
	static Result r2 = new Result();
	static Result r3 = new Result();
	static Result r4 = new Result();
	static Result r5 = new Result();
	static Result r6 = new Result();

	static TestCase tc = new TestCase();
	static TestCase tc2 = new TestCase();
	static TestCase tc3 = new TestCase();
	static TestCase tc4 = new TestCase();
	static TestCase tc5 = new TestCase();
	static TestCase tc6 = new TestCase();

	static TestSuite ts = new TestSuite();
	static TestSuite ts2 = new TestSuite();
	static TestSuite ts3 = new TestSuite();
	static TestSuite ts4 = new TestSuite();
	static TestSuite ts5 = new TestSuite();
	static TestSuite ts6 = new TestSuite();

	public static void verifyNavXShop(java.util.List<String> list1, java.util.List<String> list2, String xpath_start,
			String xpath_end) {
		try {
			list2 = Util.addToList(driver, xpath_start, xpath_end);
			Collections.sort(list1);
			Collections.sort(list2);
			log.info(list1.equals(list2));
			log.info(LOGS.PASS);
			r6.setStatus(Constants.PASS);

			tc6.setName("verifyNavXShop");
			tc6.setNumber(01);
			tc6.setSuite_id(01);

			ts6.setReport_id(r6.getId());
			ts6.setSuite_number(01);
			ts6.setSuite_name(Constants.REGRESSION);
			ts6.setTest_case_id(tc6.getId());

		} catch (Exception e) {
			System.out.println("Unable open the Browser =>" + e);
			log.info(LOGS.ERROR);
			r6.setStatus(Constants.ERROR);
			tc6.setName("OpenBrowsere");
			tc6.setNumber(01);
			tc6.setSuite_id(01);

			ts6.setReport_id(r6.getId());
			ts6.setSuite_number(01);
			ts6.setSuite_name(Constants.REGRESSION);
			ts6.setTest_case_id(tc6.getId());

		}
		session.save(r6);
		session.save(tc6);
		session.save(ts6);
		tx.commit();

	}

	public static void verifyShopByDept() {
		try {
			element = Util.findElementByXpath(driver, Constants.DEPT_XPATH);
			Actions action = new Actions(driver);
			action.moveToElement(element).build().perform();
			log.info(LOGS.PASS);
			r5.setStatus(Constants.PASS);

			tc5.setName("verifyShopByDept");
			tc5.setNumber(01);
			tc5.setSuite_id(01);

			ts5.setReport_id(r5.getId());
			ts5.setSuite_number(01);
			ts5.setSuite_name(Constants.REGRESSION);
			ts5.setTest_case_id(tc5.getId());

		} catch (Exception e) {
			System.out.println("verifyShopByDept =>" + e);
			log.info(LOGS.ERROR);
			r5.setStatus(Constants.ERROR);
			tc5.setName("verifyShopByDept");
			tc5.setNumber(01);
			tc5.setSuite_id(01);

			ts5.setReport_id(r5.getId());
			ts5.setSuite_number(01);
			ts5.setSuite_name(Constants.REGRESSION);
			ts5.setTest_case_id(tc5.getId());

		}
		session.save(r5);
		session.save(tc5);
		session.save(ts5);
		// tx.commit();

	}

	public static void verifyMenuItem() {
		try {
			for (int i = 1; i <= 5; i++)
				driver.findElement(By.xpath("//*[@id='nav-xshop']/a[" + i + "]")).getText();

			log.info(LOGS.PASS);
			r4.setStatus(Constants.PASS);

			tc4.setName("verifyMenuItem");
			tc4.setNumber(01);
			tc4.setSuite_id(01);

			ts4.setReport_id(r4.getId());
			ts4.setSuite_number(01);
			ts4.setSuite_name(Constants.REGRESSION);
			ts4.setTest_case_id(tc4.getId());

		} catch (Exception e) {
			System.out.println("verifyMenuItem =>" + e);

			log.info(LOGS.ERROR);
			r4.setStatus(Constants.ERROR);
			tc4.setName("verifyMenuItem");
			tc4.setNumber(01);
			tc4.setSuite_id(01);

			ts4.setReport_id(r4.getId());
			ts4.setSuite_number(01);
			ts4.setSuite_name(Constants.REGRESSION);
			ts4.setTest_case_id(tc4.getId());

		}
		session.save(r4);
		session.save(tc4);
		session.save(ts4);

	}

	public static String verifyPageTitle() {
		String page = "";
		try {
			page = Util.findPageTitle(driver);
			log.info(LOGS.PASS);
			r3.setStatus(Constants.PASS);

			tc3.setName("verifyPageTitle");
			tc3.setNumber(01);
			tc3.setSuite_id(01);

			ts3.setReport_id(r3.getId());
			ts3.setSuite_number(01);
			ts3.setSuite_name(Constants.REGRESSION);
			ts3.setTest_case_id(tc3.getId());

			return page;
		} catch (Exception e) {
			log.info(LOGS.ERROR);
			r3.setStatus(Constants.ERROR);
			tc3.setName("verifyPageTitle");
			tc3.setNumber(01);
			tc3.setSuite_id(01);

			ts3.setReport_id(r3.getId());
			ts3.setSuite_number(01);
			ts3.setSuite_name(Constants.REGRESSION);
			ts3.setTest_case_id(tc3.getId());

		}
		session.save(r3);
		session.save(tc3);
		session.save(ts3);
		// tx.commit();

		return page;

	}

	public static void SearchString() {
		try {
			Util.findElementbyIdAndSendKeys(driver, Constants.AMAZON_SEARCH, Constants.AMAZON_SEARCH_KEY);
			Util.findElementbyClassAndClick(driver, Constants.AMAZON_SEARCH_BTN);
			log.info(LOGS.PASS);
			r2.setStatus(Constants.PASS);

			tc2.setName("SearchString");
			tc2.setNumber(01);
			tc2.setSuite_id(01);

			ts2.setReport_id(r2.getId());
			ts2.setSuite_number(01);
			ts2.setSuite_name(Constants.REGRESSION);
			ts2.setTest_case_id(tc2.getId());

		} catch (Exception e) {

			System.out.println("SearchString =>" + e);
			log.info(LOGS.ERROR);
			r2.setStatus(Constants.ERROR);
			tc2.setName("SearchString");
			tc2.setNumber(01);
			tc2.setSuite_id(01);

			ts2.setReport_id(r2.getId());
			ts2.setSuite_number(01);
			ts2.setSuite_name(Constants.REGRESSION);
			ts2.setTest_case_id(tc2.getId());

		}
		session.save(r2);
		session.save(tc2);
		session.save(ts2);

	}

	public static void OpenBrowser() {
		try {
			driver = Util.getBrowser("HTML");
			Util.getURL(driver, Constants.AMAZON_URL);
			log.info(LOGS.PASS);
			r.setStatus(Constants.PASS);

			tc.setName("OpenBrowser");
			tc.setNumber(01);
			tc.setSuite_id(01);

			ts.setReport_id(r.getId());
			ts.setSuite_number(01);
			ts.setSuite_name(Constants.REGRESSION);
			ts.setTest_case_id(tc.getId());

		} catch (Exception e) {
			System.out.println("Unable open the Browser =>" + e);
			log.info(LOGS.ERROR);
			r.setStatus(Constants.ERROR);
			tc.setName("OpenBrowsere");
			tc.setNumber(01);
			tc.setSuite_id(01);

			ts.setReport_id(r.getId());
			ts.setSuite_number(01);
			ts.setSuite_name(Constants.REGRESSION);
			ts.setTest_case_id(tc.getId());

		}
		session.save(r);
		session.save(tc);
		session.save(ts);

	}

}
