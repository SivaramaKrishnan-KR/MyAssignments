package week4.day2.assignment;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Nykaa {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));

		driver.get("https://www.nykaa.com/");

		// Action class implementation
		Actions builder = new Actions(driver);

		// Mouse over on Brands and Search L'Oreal Paris
		WebElement brand = driver.findElement(By.xpath("//a[text()='brands']"));
		WebElement search = driver.findElement(By.id("brandSearchBox"));

		builder.moveToElement(brand).click(search).perform();

		// Click L'Oreal Paris
		search.sendKeys("L'Oreal Paris");
		Thread.sleep(2000);
		WebElement option = driver.findElement(By.xpath("//div[@class='css-ov2o3v']/a"));
		// System.out.println(option);
		// builder.click().perform();
		builder.moveToElement(option).click().perform();
		// option.click();

		// Check the title contains L'Oreal Paris
		String title = driver.getTitle();

		if (title.contains("L'Oreal Paris")) {
			driver.findElement(By.xpath("//button[@class=' css-n0ptfk']/span")).click();

			WebElement topRated = driver.findElement(By.xpath("//span[text()='customer top rated']"));
			topRated.click();

			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[@class='filter-open css-1kwl9pj']")).click();

			driver.findElement(By.xpath("//ul[@id='custom-scroll']//li[@class='css-1do4irw'][2]")).click();

			driver.findElement(By.xpath("//div[@class=' css-b5p5ep']//span")).click();

			driver.findElement(By.xpath("//div[@class='control-box css-1ap0cm9']")).click();

			driver.findElement(By.xpath("//div[@class='filter-open css-1kwl9pj']//span[text()='Concern']")).click();

			driver.findElement(By.xpath("//label[@class='control control-checkbox']//span[text()='Color Protection']"))
					.click();

			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[@id='product-list-wrap']//div[@class='css-d5z3ro']")).click();

			Set<String> windows = driver.getWindowHandles();
			List<String> handleWindows = new ArrayList<String>(windows);

			driver.switchTo().window(handleWindows.get(1));

			WebElement size = driver.findElement(By.className("css-2t5nwu"));
			Select ml = new Select(size);
			ml.selectByVisibleText("175ml");

			String mrp = driver.findElement(By.xpath("//div[@class='css-1d0jf8e']//span[2]")).getText();
			System.out.println("The MRP of the product is " + mrp);

			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[@class='css-vp18r8']//span")).click();

			driver.findElement(By.xpath("//div[@class='css-0 e1ewpqpu1']//button")).click();

			//Thread.sleep(2000);
			WebElement iFrame = driver.findElement(By.className("css-acpm4k"));
			driver.switchTo().frame(iFrame);
			String grandTotal = driver.findElement(By.xpath("(//span[@color='#001325'])[2]")).getText();
			//String grandTotal = driver.findElement(By.xpath("//span[@class='css-n8gwxi e171rb9k3']")).getText();
			//grandTotal.getText();

			System.out.println("The Grand total of the product is:" + grandTotal);

			driver.findElement(By.xpath("//button[@class='css-guysem e8tshxd0']//span[text()='Proceed']")).click();

			driver.findElement(By.xpath("//button[text()='CONTINUE AS GUEST']")).click();

			String finalGrandTotal = driver.findElement(By.xpath("//div[@class='payment-details-tbl grand-total-cell prl20']//div[2]")).getText();

			System.out.println("The grand total of the product is: " + finalGrandTotal);

			if (grandTotal.contains(finalGrandTotal)) {
				System.out.println("The grand total matches for the product");
				driver.close();
			} else {
				System.out.println("The grand total of the product doesn't match. Please check");
			}
		} else {
			System.out.println("no");
		}
	}

}
