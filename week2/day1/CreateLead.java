package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//initializing setup
		WebDriverManager.chromedriver().setup();
	
		ChromeDriver driver=new ChromeDriver();
		
		//Maximize windows and impilicit wait
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//geturl
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		//finding elements and assigning values 
		WebElement UserName = driver.findElement(By.name("USERNAME"));
		UserName.sendKeys("Demosalesmanager");
		WebElement Passsword = driver.findElement(By.name("PASSWORD"));
		Passsword.sendKeys("crmsfa");
		
		WebElement Login = driver.findElement(By.className("decorativeSubmit"));
		Login.click();
		
		WebElement LinkCrmSfa = driver.findElement(By.linkText("CRM/SFA"));
		LinkCrmSfa.click();
		
		driver.findElement(By.linkText("Leads")).click();
		
		driver.findElement(By.linkText("Create Lead")).click();
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Cognizant");
		
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Sivaram");
		
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("R");
		
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Testing");
		
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Good to learn Selenium");
		
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("r.sivask@gmail.com");
		
		driver.findElement(By.className("smallSubmit")).click();
		
		System.out.println("Driver Title is: " + driver.getTitle());
		
		//driver.close();
	}

}
