package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditBoxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1. To Perform edit boxes operations
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver_win32//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://testleaf.herokuapp.com/");
		
		driver.findElement(By .xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[1]/a/img")).click();
		
		WebElement emailbox=driver.findElement(By .id("email"));
		emailbox.sendKeys("text2gmail.com");
		
		WebElement appendbox=driver.findElement(By .xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/input"));
		appendbox.sendKeys("hi");
		
		WebElement gettextbox=driver.findElement(By .name("username"));
		String Value=gettextbox.getAttribute("value");
		System.out.println(Value);
		
		WebElement clearbox=driver.findElement(By .xpath("//*[@id=\"contentblock\"]/section/div[4]/div/div/input"));
		clearbox.clear();
		
		WebElement disablebox=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[5]/div/div/input"));
		Boolean enabled=disablebox.isEnabled();
		System.out.println(enabled);
		
		
		

	}

}
