package week4.day1.assignment;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewWindow {

	ChromeDriver driver = new ChromeDriver();

	public void newTab() {

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://leafground.com/window.xhtml");

		String title = driver.getTitle();

		// System.out.println(title);

		driver.findElement(By.xpath("//span[text()='Open']")).click();

		Set<String> window = driver.getWindowHandles();
		List<String> handleWindow = new ArrayList<String>(window);

		driver.switchTo().window(handleWindow.get(1));

		String title2 = driver.getTitle();

		driver.close();
		driver.switchTo().window(handleWindow.get(0));

		// System.out.println(title2);

		if (title != title2) {
			System.out.println("New window is opened: " + title2);
		} else
			System.out.println("Failure");

		// driver.quit();

	}

	public void noOfTabs() {

		// driver.get("https://leafground.com/window.xhtml");

		driver.findElement(By.xpath("//span[text()='Open Multiple']")).click();

		Set<String> count = driver.getWindowHandles();
		List<String> windowCount = new ArrayList<String>(count);

		int temp = 0;

		for (int i = 1; i < windowCount.size(); i++) {
			driver.switchTo().window(windowCount.get(i));

			System.out.println("Window opened and closed: " + driver.getTitle());

			driver.close();

			driver.switchTo().window(windowCount.get(0));
			temp++;
		}

		System.out.println("Total number of tabs open currently: " + temp);

	}

	public void closeWindow() {
		// driver.get("https://leafground.com/window.xhtml");

		driver.findElement(By.xpath("//span[text()='Close Windows']")).click();

		Set<String> tabs = driver.getWindowHandles();
		List<String> tabList = new ArrayList<String>(tabs);

		System.out.println("Close tab size: " + tabList.size());

		int temp = 0;

		for (int i = 1; i < tabList.size(); i++) {
			driver.switchTo().window(tabList.get(i));

			System.out.println("Window opened and closed: " + driver.getTitle());

			driver.close();

			driver.switchTo().window(tabList.get(0));
			temp++;
		}

		System.out.println("No of windows opened and closed: " + temp);
	}

	public void delay() {
		driver.findElement(By.xpath("//span[text()='Open with delay']")).click();

		Set<String> count = driver.getWindowHandles();
		List<String> windowCount = new ArrayList<String>(count);

		int temp = 0;

		for (int i = 1; i < windowCount.size(); i++) {
			driver.switchTo().window(windowCount.get(i));

			System.out.println("Window opened and closed: " + driver.getTitle());

			driver.close();

			driver.switchTo().window(windowCount.get(0));
			temp++;
		}
		System.out.println("Delayed Tabs: " + temp);

	}
}
