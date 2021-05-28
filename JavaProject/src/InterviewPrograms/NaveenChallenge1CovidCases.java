package InterviewPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NaveenChallenge1CovidCases {

	public static WebDriver driver;

	public static void GetValues() {

		String BirthRateToday=driver.findElement(By.xpath("//span[@rel='births_today']")).getText();
		String DeathRateToday=driver.findElement(By.xpath("//span[@rel='dth1s_today']")).getText();
		String TotalGrowthToday=driver.findElement(By.xpath("//span[@rel='absolute_growth']")).getText();

		System.out.println(" Births today is  "+BirthRateToday);
		System.out.println(" Deaths today is " +DeathRateToday);
		System.out.println(" Population Growth today "+TotalGrowthToday);

		System.out.println();
		
		String BirthRateYear=driver.findElement(By.xpath("//span[@rel='births_this_year']")).getText();
		String DeathRateYear=driver.findElement(By.xpath("//span[@rel='dth1s_this_year']")).getText();
		String TotalGrowthYear=driver.findElement(By.xpath("//span[@rel='absolute_growth_year']")).getText();

		System.out.println(" Births this year "+BirthRateYear);
		System.out.println(" Deaths this year "+DeathRateYear);
		System.out.println(" Population Growth this year "+TotalGrowthYear);
		System.out.println();
		System.out.println();
	}


	public static void main(String[] args) {



		driver = new ChromeDriver();
		driver.get("https://www.worldometers.info/world-population/");

		long t= System.currentTimeMillis();
		long end = t+15000;

		int k=1;

		while(System.currentTimeMillis() < end) {

			System.out.println(k);

			k++;

			GetValues();

		}
		
		driver.close();
	}

}
