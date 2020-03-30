import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","/home/shubham/Downloads/chromedriver_linux64/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).click();
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Davy");
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("jones");
		driver.findElement(By.xpath("//input[@type='email']")).click();
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("shubham.verma1 @tothenew.com");
		

	}

}