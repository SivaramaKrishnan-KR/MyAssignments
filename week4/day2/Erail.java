package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Erail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://erail.in/");
		
		WebElement txtStationFrom = driver.findElement(By.id("txtStationFrom"));
		txtStationFrom.clear();
		txtStationFrom.sendKeys("ms", Keys.TAB);
		
		WebElement txtStationTo = driver.findElement(By.id("txtStationTo"));
		txtStationTo.clear();
		txtStationTo.sendKeys("tup", Keys.TAB);
		
		driver.findElement(By.xpath("//input[@id='chkSelectDateOnly']")).click();
		
		List<WebElement> trainList = driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']//tr"));
		int trainListCount=trainList.size();
		//System.out.println(trainListCount);
		
		List<String> trainDetails=new ArrayList<String>();
		
		
		for(int i=2; i<=trainListCount;i++)
		{
			String trainName = driver.findElement(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']//tr["+i+"]/td[2]")).getText();
			//trainName.getText();
			//System.out.println(trainName);
			//List<String> trainDetails=new ArrayList<String>();
			trainDetails.add(trainName);
		}
		System.out.println(trainDetails.size());
		
		Set<String> noDupTrain=new LinkedHashSet<String>();
		for(String sup:trainDetails )
		{
			noDupTrain.add(sup);
		}
		System.out.println("Total num of trains without duplicate : "+noDupTrain.size());
	}

}
