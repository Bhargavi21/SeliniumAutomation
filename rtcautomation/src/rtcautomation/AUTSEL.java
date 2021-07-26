package rtcautomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AUTSEL {
 
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dhanunjaya\\Desktop\\EY file\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://accounts.google.com");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.findElement(By.id("identifierId")).sendKeys("n.bhargavi2424@gmail.com");
		driver.findElement(By.xpath("//*[@id=\'identifierNext\']/div/button/span")).click();
        driver.findElement(By.name("password")).sendKeys("Bhargavi@Badri21");
        driver.findElement(By.xpath("//*[@id=\'passwordNext\']/div/button/span")).click();
	}

}
 