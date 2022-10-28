package week4.day2.assignment;

import java.time.Duration;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Chittorgarh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://www.chittorgarh.com/");

		driver.findElement(By.xpath("//a[@title='Stock Market']")).click();

		driver.findElement(By.xpath("//div[@class='col-12 col-md-2 col-sm-3']//a[text()='NSE Bulk Deals']")).click();

		List<WebElement> rowList = driver.findElements(
				By.xpath("//table[@class='table table-bordered table-condensed table-striped']//tr//td[3]"));
		// int rowSize=rowList.size();
		// System.out.println(rowSize);

		List<String> names = new ArrayList<String>();

		for (int i = 2; i < rowList.size(); i++) {
			String text = driver.findElement(By.xpath(
					"//table[@class='table table-bordered table-condensed table-striped']//tr[" + i + "]//td[3]"))
					.getText();

			names.add(text);
		}

		Set<String> check = new LinkedHashSet<String>();
		check.addAll(names);

		// System.out.println(check.size());

		int totalDuplicates = rowList.size() - check.size();

		if (rowList.size() == check.size()) {
			System.out.println("There is no duplicates in the list");
		} else
			System.out.println("There are/is " + totalDuplicates + " duplicates in the list");
	}

}
