package mvn_project.mvn_project4;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.support.ui.Select;

import com.google.j2objc.annotations.Property;

public class Keywords {
	WebDriver driver;
	FileInputStream fis;
	Properties prop;

	public  void open() {
		System.setProperty("webdriver.chrome.driver", "C://Seleniumfiles//chromedriver.exe");
		try {
			driver = new ChromeDriver();
		fis = new FileInputStream("C:\\java\\eclipse\\mvn_project4\\src\\main\\java\\mvn_project\\mvn_project4\\object1file");
			prop = new Properties();
		prop.load(fis);
		
			
		} catch (Exception e) {
			e.printStackTrace();
		} 
		//Select select = new Select(driver);
	}

	public void url(String httpurl) {
		driver.get(httpurl);
	}

	public void input(String testdata, String objectname) {
		// TODO Auto-generated method stub
		driver.findElement(By.xpath(prop.getProperty(objectname))).sendKeys(testdata);
	}

	public void click(String objectname) {
driver.findElement(By.xpath(prop.getProperty(objectname))).click();		
	}

	public void link(String objectname) {
    driver.findElement(By.xpath(prop.getProperty(objectname))).click();		
	}

	public void close() {
driver.close();		
	}

	public void inputbyname(String testdata, String objectname) {
driver.findElement(By.name(prop.getProperty(objectname))).sendKeys(testdata);		
	}

	public void selectname(String testdata, String objectname) {
		driver.findElement(By.name(prop.getProperty(objectname))).sendKeys(testdata);
	}

}
