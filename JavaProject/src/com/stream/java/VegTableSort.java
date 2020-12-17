package com.stream.java;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class VegTableSort {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.rahulshettyacademy.com/#/index");
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.findElement(By.xpath("//tr/th[1]")).click();
		List<WebElement> Lists = driver.findElements(By.xpath("//tr/td[1]"));
		List<String> text = new ArrayList<String>();
		for (WebElement webElement : Lists) {

			text.add(webElement.getText());
		}

		List<String> FromWeb = Lists.stream().map(s -> s.getText()).collect(Collectors.toList());

		List<String> SortedList = FromWeb.stream().sorted().collect(Collectors.toList());

		Assert.assertTrue(SortedList.equals(FromWeb));
		Assert.assertTrue(SortedList.equals(text));
	
	}

}
