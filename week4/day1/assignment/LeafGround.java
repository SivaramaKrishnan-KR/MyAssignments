package week4.day1.assignment;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGround {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();

		// ChromeDriver driver=new ChromeDriver();
		// driver.manage().window().maximize();
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		NewWindow opentab = new NewWindow();
		System.out.println("======NEW TAB==========");
		opentab.newTab();

		System.out.println("======Number of Tabs==========");
		opentab.noOfTabs();

		System.out.println("======closed Tab List==========");
		opentab.closeWindow();

		System.out.println("======Delay Tab==========");
		opentab.delay();
	}

}
