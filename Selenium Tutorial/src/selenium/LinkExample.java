package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public final class LinkExample {

	public static void main(String[] args) { 
		// TODO Auto-generated method stub
		
		//1. To open link
		

		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Downloads\\chromedriver_win32//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.leafground.com/");
		
		
		driver.findElement(By .xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[3]/a/img")).click();
		
		driver.findElement(By .linkText("Go to Home Page")).click();

	}

}
