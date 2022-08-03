package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenGoogleWithFirefox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. Open Firefox
		//2. Go Homepage
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\User\\Downloads\\geckodriver-v0.31.0-win64//geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.google.co.in");
		driver.quit();

	}

}
