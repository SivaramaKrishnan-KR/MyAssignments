package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();

		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));

		driver.manage().window().maximize();

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

		driver.findElement(By.linkText("Phone")).click();

		Thread.sleep(2000);
		WebElement countryCode=driver.findElement(By.xpath("//input[@name='phoneCountryCode']"));
		countryCode.clear();
		countryCode.sendKeys("91");

		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();

		Thread.sleep(2000);
		String dispText = driver.findElement(By.xpath("//div[@class='x-paging-info']")).getText();

		if(dispText.contains("No records"))
		{
			System.out.println("No records to Display");
		}
		else
		{
			Thread.sleep(2000);
			WebElement value = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"));
			String ID=value.getText();
			System.out.println("Lead ID is: "+ID);
			value.click();

			driver.findElement(By.className("subMenuButtonDangerous")).click();

			driver.findElement(By.linkText("Find Leads")).click();

			driver.findElement(By.xpath("//input[@id='ext-gen246']")).sendKeys(ID);

			driver.findElement(By.xpath("//button[text()='Find Leads']")).click();

			Thread.sleep(2000);
			String finalText = driver.findElement(By.xpath("//div[@class='x-paging-info']")).getText();

			System.out.println("Text after deleting the 1st row from grid is :" +finalText);

		}

	}

}
