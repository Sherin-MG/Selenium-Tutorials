package selenium;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DownloadFileExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/file.xhtml;jsessionid=node0fzykm5m73aue1cnnzxjxor4e75505.node0");
		WebElement downloadbutton=	driver.findElement(By.xpath("//*[@id=\"j_idt93:j_idt95\"]/span[2]"));
		downloadbutton.click();
		//C:\Users\User\Downloads(to check whether it is downloaded)
		File windowsfile = new File("C:\\Users\\User\\Downloads");
		File[] entirefiles=	windowsfile.listFiles();
		for (File file : entirefiles) {
			if (file.getName().equals("TestLeaf Logo")); {
				System.out.println("the file is present");
				break;
			
				
			}
			
		}
	}

}
