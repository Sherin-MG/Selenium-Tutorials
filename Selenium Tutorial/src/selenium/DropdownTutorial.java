package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownTutorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Dropdown.html");
		
		//1. Select using index
		WebElement indexbox1=driver.findElement(By.id("dropdown1"));
		Select byindex = new Select(indexbox1);
		byindex.selectByIndex(1);
		//2. select using value
		WebElement indexbox2=driver.findElement(By.name("dropdown2"));
		Select usingvalue = new Select(indexbox2);
		usingvalue.selectByValue("1");
			
		//3. select using visible text
		WebElement indexbox3=	driver.findElement(By.xpath("//*[@id=\"dropdown3\"]"));
		Select visibletext = new Select(indexbox3);
		visibletext.selectByVisibleText("Selenium");
		
		//4.To get number of options
		WebElement indexbox4=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/select"));
		Select noofoptions = new Select(indexbox4);
		List<WebElement>optionsare=	noofoptions.getOptions();
		int listofoptions=	optionsare.size();
		System.out.println("number of options are:"+listofoptions);
		
		//5.To select using send keys
		WebElement indexbox5=	driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[5]/select"));
		indexbox5.sendKeys("Selenium");
		
		//6.  selection of web elements
		WebElement indexbox6=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[6]/select"));
		Select multiselectbox = new Select(indexbox6);
		multiselectbox.selectByValue("1");
		multiselectbox.selectByValue("2");
		multiselectbox.selectByValue("3");
		
	}

}
