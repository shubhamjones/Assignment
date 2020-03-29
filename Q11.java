import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.Assert;

public class Q11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","/home/shubham/Downloads/chromedriver_linux64/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		System.out.println(driver.findElement(By.id("Button1")).isEnabled());
		WebElement Male=driver.findElement(By.xpath("//input[@value='Male']"));
		Male.click();
		Assert.assertTrue(Male.isSelected());
		Assert.assertEquals(driver.findElement(By.tagName("h1")).getText(), "Automation Demo Site");
		Assert.assertEquals(driver.getTitle(), "Register");

	}

}