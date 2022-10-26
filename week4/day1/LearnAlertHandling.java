package week4.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnAlertHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//driver.switchto().alert()
		//driver.switchto.parent -> to move the control to immediate parent
		
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("http://testleaf.herokuapp.com/pages/Alert.html");
		
		WebElement PromptBox = driver.findElement(By.xpath("//button[text()='Prompt Box']"));
		PromptBox.click();
		
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("Cognizant");
		alert.accept();
		
		String text = driver.findElement(By.xpath("//p[@id='result1']")).getText();
		//text.getText();
		
		System.out.println(text);
	}

}
