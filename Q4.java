
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","/home/shubham/Downloads/chromedriver_linux64/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.get("https://www.tothenew.com");
		driver.findElement(By.xpath("(//a[@id='h-contact-us'])[2]")).click();
		// Thread.sleep(2000);
		// driver.navigate().back();
		// driver.findElement(By.id("h-contact-us")).click();
		// Note: this id is not unique and there are more than one element pointed by
		// this id.. so this is not working.

	}

}
