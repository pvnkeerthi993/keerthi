package webTable;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sun.xml.bind.v2.schemagen.xmlschema.List;

public class WebTable_Practice {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Software\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://money.rediff.com/gainers");
		List<> allCompanies=driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr[1]/td[1]")).getText();
		
	}

}
