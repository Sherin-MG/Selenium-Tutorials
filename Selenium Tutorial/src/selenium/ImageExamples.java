package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImageExamples {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://testleaf.herokuapp.com/pages/Image.html");
		WebElement brokenimage=	driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div"));
		Thread.sleep(3000);
		//naturalwidth=0 it is broken(cssattribute)	
		if (brokenimage.getCssValue("naturalWidth").equals("0")) {
			System.out.println("The image is broken");
			
		}else {
			System.out.println("The image is not broken");
		}
			
		
		}
		

	}


