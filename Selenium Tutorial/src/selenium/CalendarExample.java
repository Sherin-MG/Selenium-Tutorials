package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/calendar.xhtml");
		Thread.sleep(2000);
		WebElement nextbutton=	driver.findElement(By.xpath("//*[@id=\"j_idt87:schedule\"]/div[1]/div[1]/div/button[2]"));
		nextbutton.click();
		Thread.sleep(3000);
		WebElement datebutton=	driver.findElement
		(By.xpath("//*[@id=\"j_idt87:schedule\"]/div[2]/div/table/tbody/tr/td/div/div/div/table/tbody/tr[1]/td[2]/div"));
		datebutton.click();
		Thread.sleep(2000);
		WebElement eventbox=	driver.findElement(By.id("j_idt87:title"));
		eventbox.sendKeys("Home"+ Keys.ENTER);
		
		
		
		
			
		}
		
		
		
		
	}


