package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AccessBrowser {

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
		
		//Browser maximize and close
		driver.manage().window().maximize();
		driver.close();

	}

}
