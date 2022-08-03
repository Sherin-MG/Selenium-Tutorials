package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver_win32//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.leafground.com/pages/checkbox.html");
		//1.To select language
		WebElement checkbox1=	driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/input[1]"));
		checkbox1.click();
		
		//2. to confirm whether it is checked
		WebElement checkbox2=	driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/input"));
		Boolean status1=	checkbox2.isSelected();
		System.out.println(status1);
		
		//3.To deselect select checkbox
		WebElement checkbox3= driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/input[2]"));
		if (checkbox3.isSelected()) {
		Thread.sleep(5000);
		checkbox3.click();	
			
		}
			
		
	}

}
