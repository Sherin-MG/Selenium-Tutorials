package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver_win32//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.leafground.com/");
		
		driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[2]/a/img")).click();
		
		//1.To find XY position
		WebElement getpositionbutton=driver.findElement(By.id("position"));
		org.openqa.selenium.Point	xypoint=getpositionbutton.getLocation();
		int xpoint=xypoint.getX();
		int Ypoint=xypoint.getY();
		System.out.println("xpoint is "+ xpoint);
		System.out.println("Ypoint is "+ Ypoint);
		
		//2.To find colour of box
		WebElement colourofbox =	driver.findElement(By .id("color"));
		String colour=colourofbox.getCssValue("background-color");
		
		System.out.println("colour is : "+ colour);
		//3.To find size
		WebElement size=driver.findElement(By.id("size"));
		int height=	size.getSize().getHeight();
		int width=	size.getSize().getWidth();
		System.out.println("height is : "+ height);
		System.out.println("width is : "+ width);

	}

}
