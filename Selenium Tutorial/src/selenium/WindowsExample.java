package selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://testleaf.herokuapp.com/pages/Window.html");
		
		//1.To open edit box in multiple window
		String parentwindow=	driver.getWindowHandle();
		WebElement gotohomepage=	driver.findElement(By.id("home"));
		gotohomepage.click();
		Set<String>Multiplewindow=	driver.getWindowHandles();
		for (String newwindow : Multiplewindow) {
		driver.switchTo().window(newwindow);
			
		}
		
		WebElement editbox=	driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[1]/a/h5"));
		editbox.click();
		Thread.sleep(3000);
		driver.close();
		driver.switchTo().window(parentwindow);
		
		//2. To find number of windows
		WebElement openmultiplewindows=	driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/button"));
		openmultiplewindows.click();
		int number=	driver.getWindowHandles().size();
		System.out.println(number);
		
		//3.Do not close parent window
		WebElement donotcloseme=	driver.findElement(By.xpath("//*[@id=\"color\"]"));
		donotcloseme.click();
		Set<String>multiwindow2=	driver.getWindowHandles();
		for (String newwindow2 : multiwindow2) {
			if (!newwindow2.equals(parentwindow)){
				driver.switchTo().window(newwindow2);
				Thread.sleep(3000);
				driver.close();
				
			}
				
				
		}
		Thread.sleep(3000);
		driver.quit();
		}

	}


