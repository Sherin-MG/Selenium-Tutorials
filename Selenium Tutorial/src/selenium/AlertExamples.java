package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertExamples {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Alert.html");
		
		//1. normal alert
		WebElement normalalert=	driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/div/div/button"));
		normalalert.click();
		Alert status= driver.switchTo().alert();
		Thread.sleep(5000);
		status.accept();
		
		//2.confirmation alert
		WebElement confirmationalert=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/button"));
		confirmationalert.click();
		Alert status2= driver.switchTo().alert();
		Thread.sleep(5000);
		status2.dismiss();
		
		//3. prompt alert
		WebElement promptalert=	driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div/div/button"));
		promptalert.click();
		Alert status3= driver.switchTo().alert();
		status3.sendKeys("home");
		Thread.sleep(5000);
		status3.accept();
		
	}

}
