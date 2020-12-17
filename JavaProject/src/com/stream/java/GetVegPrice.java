package com.stream.java;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetVegPrice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.findElement(By.xpath("//tr/th[1]")).click();
		List<WebElement> Lists = driver.findElements(By.xpath("//tr/td[1]"));
		List<String> Price=Lists.stream().filter(s->s.getText().contains("Beans")).map(s->getPrice(s)).collect(Collectors.toList());
		System.out.println(Price);
	
	}
	
	public static String getPrice(WebElement s) {
		String price=s.findElement(By.xpath("following::td[1]")).getText();
		return price;
		
		
	}

}
