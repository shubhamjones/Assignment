import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Registration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","/home/shubham/Downloads/chromedriver_linux64/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://newtours.demoaut.com");
		driver.findElement(By.linkText("REGISTER")).click();
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Shubham");
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Verma");
		driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("1234567891");
		driver.findElement(By.id("userName")).sendKeys("shubham.verma1@tothenew.com");
		driver.findElement(By.xpath("//input[@name='address1']")).sendKeys("Noida-144");
		driver.findElement(By.xpath("//input[@name='city']")).sendKeys("Noida");
		driver.findElement(By.xpath("//input[@name='state']")).sendKeys("UP");
		Select s = new Select(driver.findElement(By.xpath("//select[@name='country']")));
		s.selectByValue("92");
		driver.findElement(By.xpath("//input[@name='postalCode']")).sendKeys("201310");
		driver.findElement(By.id("email")).sendKeys("shubham.verma1@tothenew.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("1234567");
		driver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys("1234567");
		driver.findElement(By.xpath("//input[@name='register']")).click();

	}

}