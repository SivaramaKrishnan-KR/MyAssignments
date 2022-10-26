package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TextBox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();

		ChromeDriver driver=new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://www.leafground.com/input.xhtml");

		driver.findElement(By.xpath("//input[@placeholder='Babu Manickam']")).sendKeys("Sivaram");

		WebElement appendValue = driver.findElement(By.xpath("//input[@value='Chennai']"));
		String value=appendValue.getText();
		appendValue.clear();

		appendValue.sendKeys(value+" "+"TamilNadu");

		boolean textBox = true;

		textBox = driver.findElement(By.xpath("//input[@placeholder='Disabled']")).isEnabled();
		if(textBox == false)
		{
			System.out.println("Test box is disabled");
		}
		else
		{
			System.out.println("Test Box is enabled");
		}

		driver.findElement(By.xpath("//input[@value='Can you clear me, please?']")).clear();

		
		Thread.sleep(2000);
		String textValue = driver.findElement(By.xpath("//input[@value='My learning is superb so far.']")).getAttribute("value");
		System.out.println("Retrieved text is "+ textValue);
		
		//System.out.println(driver.findElement(By.xpath("//input[@value='My learning is superb so far.']")).getAttribute("value"));
		
		
	}

}
