package selenium;

import java.awt.Dimension;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://testleaf.herokuapp.com/pages/table.html");
		//1. To find number of columns
		List<WebElement>	columns=	driver.findElements(By.tagName("th"));
		int columncount=	columns.size();
		System.out.println("Number of columns = "+columncount);
		//2. To find number of rows
		List<WebElement>rows=driver.findElements(By.tagName("tr"));
		int rowcount=	rows.size();
		System.out.println("Number of rows = "+rowcount);
		//3. To get progress value of learn to interact
		WebElement progressvalue=	driver.findElement(By.xpath("//td[normalize-space()='Learn to interact with Elements']//following::td[1]"));
		String value=	progressvalue.getText();
		System.out.println("The progress value is ="+value);
		//4.To check the vital task for the least completed progress
		List<Integer>numberlist= new ArrayList<Integer>();
		List<WebElement>allprogress=	driver.findElements(By.xpath("//td[2]"));
		for (WebElement webElement : allprogress) {
		String individualvalue=	webElement.getText().replace("%","");
		//Integer.parseInt(individualvalue)-to convert string to integer
		numberlist.add(Integer.parseInt(individualvalue));
			
		}
		System.out.println(numberlist);
		int smallvalue=	Collections.min(numberlist);
		System.out.println(smallvalue);
		String smallvaluestring=	Integer.toString(smallvalue)+"%";
		String	finalxpath= "//td[normalize-space()="+"\""+ smallvaluestring +"\""+"]//following::td[1]";
		//td[normalize-space()='20%']//following::td[1]
		// "+"\""+ smallvaluestring + "\""+" escaping charcters
		System.out.println(finalxpath);
		WebElement checkbox=	driver.findElement(By.xpath(finalxpath));
		checkbox.click();
		
	}

}
