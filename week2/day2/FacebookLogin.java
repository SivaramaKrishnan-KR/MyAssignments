package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();

		ChromeDriver driver=new ChromeDriver();

		driver.get("https://en-gb.facebook.com/");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.findElement(By.linkText("Create New Account")).click();

		driver.findElement(By.name("firstname")).sendKeys("Sivaram");

		driver.findElement(By.name("lastname")).sendKeys("Ram");

		driver.findElement(By.name("reg_email__")).sendKeys("9600764731");

		driver.findElement(By.id("password_step_input")).sendKeys("987654321mn");

		WebElement BirthDay = driver.findElement(By.name("birthday_day"));
		Select day=new Select(BirthDay);
		day.selectByIndex(24);

		WebElement Month = driver.findElement(By.id("month"));
		Select month=new Select(Month);
		month.selectByVisibleText("Jan");

		WebElement Year = driver.findElement(By.id("year"));
		Select year=new Select(Year);
		year.selectByValue("1992");
		
		driver.findElement(By.xpath("//label[text()='Male']")).click();
	}

}
