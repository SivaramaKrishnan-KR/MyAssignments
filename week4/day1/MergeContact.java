package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MergeContact {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Contacts")).click();
		
		driver.findElement(By.xpath("//a[text()='Merge Contacts']")).click();
		
		driver.findElement(By.xpath("(//img[@src='/images/fieldlookup.gif'])[1]")).click();
		
		Set<String> windows=driver.getWindowHandles();
		ArrayList<String> handleWindow=new ArrayList<String>(windows);
		
		//System.out.println(windows);
		
		driver.switchTo().window(handleWindow.get(1));
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//div[contains(@class,'x-grid3-body')]//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a")).click();
		
		driver.switchTo().window(handleWindow.get(0));
		//System.out.println("yes");
		driver.findElement(By.xpath("(//img[@src='/images/fieldlookup.gif'])[2]")).click();
		
		Set<String> windows1=driver.getWindowHandles();
		ArrayList<String> handleWindow1=new ArrayList<String>(windows1);
		
		driver.switchTo().window(handleWindow1.get(1));
		//System.out.println("Next : "+ windows1);
					
		//System.out.println(driver.getTitle());
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("(//div[contains(@class,'x-grid3-body')]//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a)[2]")).click();
		driver.switchTo().window(handleWindow1.get(0));
		
		driver.findElement(By.xpath("//a[text()='Merge']")).click();
		
		driver.switchTo().alert().accept();
		
		System.out.println(driver.getTitle());
	}

}
