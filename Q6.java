import java.awt.AWTException;
import java.awt.Robot;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q6 {
	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/home/shubham/Downloads/chromedriver_linux64/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.toolsqa.com/automation-practice-switch-windows");
//		System.out.println(driver.findElements(By.tagName("frame")).size());
		driver.manage().window().maximize();
		Robot robot = new Robot();
		robot.keyPress(17);
		robot.keyPress(84);
		robot.keyRelease(17);
		robot.keyRelease(84);
		Set<String> str= driver.getWindowHandles();
		Iterator<String> itr = str.iterator();
		while(itr.hasNext())
		driver.switchTo().window(itr.next());
		driver.get("https://www.toolsqa.com/automation-practice-switch-windows");
		driver.findElement(By.xpath("//ul[@id='primary-menu']/li[5]/a/span")).click();
		
	}

}