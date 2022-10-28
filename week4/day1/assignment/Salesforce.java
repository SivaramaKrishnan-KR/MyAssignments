package week4.day1.assignment;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Salesforce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://login.salesforce.com/");

		driver.findElement(By.id("username")).sendKeys("ramkumar.ramaiah@testleaf.com");
		driver.findElement(By.id("password")).sendKeys("Password#123");

		driver.findElement(By.id("Login")).click();

		driver.findElement(By.xpath("//span[text()='Learn More']")).click();

		Set<String> window = driver.getWindowHandles();
		List<String> handleWindow = new ArrayList<String>(window);

		//System.out.println(handleWindow);
		
		driver.switchTo().window(handleWindow.get(1));

		driver.findElement(By.xpath("//button[text()='Confirm']")).click();

		System.out.println(driver.getTitle());

		driver.close();

		driver.switchTo().window(handleWindow.get(0));

		driver.close();
	}

}
