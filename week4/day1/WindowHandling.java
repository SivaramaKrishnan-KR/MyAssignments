package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();

		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://www.irctc.co.in/");

		//Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='OK']")).click();

		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[@class='menu-list header-icon-menu'][3]")).click();

		Set<String> windows = driver.getWindowHandles();
		List<String> handleWindows=new ArrayList<String>(windows);

		driver.switchTo().window(handleWindows.get(1));

		String textFlight = driver.findElement(By.className("form-check-label")).getText();

		driver.switchTo().window(handleWindows.get(0));
		System.out.println(driver.getTitle());
		driver.close();
	}

}
