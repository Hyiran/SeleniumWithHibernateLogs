package com.base.packs;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Core {
	static WebDriver driver;
	static WebElement element;
	static String title;
	static java.util.List<String> list1 = new ArrayList<String>();
	static java.util.List<String> list2 = new ArrayList<String>();

	public static void main(String[] args) {

		driver = Util.getBrowser("CHROME");
		Util.getURL(driver, Constants.GOOGLE_URL);

		title = Util.getPageTitle(driver);

		System.out.println(title);
		Util.findElementbyIdAndSendKeys(driver, Constants.SEARCH_BOX, Constants.SEARCH_KEY);
		Util.findElementbyNameAndClick(driver, Constants.BUTTON_NAME);

	}

}
