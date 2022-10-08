package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClassAssessment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Driver setup
		WebDriverManager.chromedriver().setup();
		
		//WebDriverManager.edgedriver().setup();

		//Driver initializing
		ChromeDriver driver=new ChromeDriver();
		//EdgeDriver driver= new EdgeDriver();

		//URL navigation
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		//Browser maximize
		driver.manage().window().maximize();
		
		//Entering input values, click on link and button
		WebElement username = driver.findElement(By.name("USERNAME"));
		username.sendKeys("Demosalesmanager");
		
		WebElement password = driver.findElement(By.name("PASSWORD"));
		password.sendKeys("crmsfa");
		
		WebElement login = driver.findElement(By.className("decorativeSubmit"));
		login.click();
		
		WebElement link = driver.findElement(By.linkText("CRM/SFA"));
		link.click();
		
		WebElement tab = driver.findElement(By.linkText("Leads"));
		tab.click();
		
		WebElement subTab = driver.findElement(By.linkText("Create Lead"));
		subTab.click();
		
		WebElement leadFirstName = driver.findElement(By.id("createLeadForm_firstName"));
		leadFirstName.sendKeys("Sivarama Krishnan");
		
		WebElement leadLastName = driver.findElement(By.id("createLeadForm_lastName"));
		leadLastName.sendKeys("R");
		
		WebElement leadCompanyName = driver.findElement(By.id("createLeadForm_companyName"));
		leadCompanyName.sendKeys("Cognizant");
		
		WebElement createLead = driver.findElement(By.className("smallSubmit"));
		createLead.click();
		
		
		//driver.close();

	}

}
