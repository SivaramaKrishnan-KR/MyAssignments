package week2.day2;

import java.time.Duration;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;


public class EditLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub


		//initializing setup
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver=new ChromeDriver();

		//Maximize windows and implicitly wait
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

		driver.findElement(By.linkText("Find Leads")).click();

		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Sivaram");

		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();

		Thread.sleep(2000);
		WebElement firstClick = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"));
		firstClick.click();

		String title=driver.getTitle();

		if(title.contains("View Lead"))
		{
			driver.findElement(By.xpath("//a[text()='Edit']")).click();

			WebElement cmpnyName = driver.findElement(By.xpath("//input[@id='updateLeadForm_companyName']"));
			cmpnyName.clear();
			cmpnyName.sendKeys("Cognizant");
			
			String nameChange=driver.findElement(By.xpath("//input[@id='updateLeadForm_companyName']")).getText();

			driver.findElement(By.xpath("//input[@value='Update']")).click();

			String companyName= driver.findElement(By.xpath("//span[@id='viewLead_companyName_sp']")).getText();

			if (companyName.contains(nameChange))
			{
				System.out.println("Success");
				driver.close();
			}

			else
			{
				System.out.println("Failure");
			}

		}
	}
}