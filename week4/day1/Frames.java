package week4.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//initialize Web driver
		WebDriverManager.chromedriver().setup();
		
		//Driver setup
		ChromeDriver driver=new ChromeDriver();
		
		//Manage driver
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//URL Navigation
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		
		//Switching frame
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		
		//managing alert box
		Alert Tryit = driver.switchTo().alert();
		Tryit.sendKeys("Sivaram");
		Tryit.accept();
		
		//getting the text and displaying
		String text = driver.findElement(By.xpath("//p[@id='demo']")).getText();
		
		System.out.println(text);
		
		driver.close();
	}

}
