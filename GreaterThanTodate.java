import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GreaterThanTodate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","/home/shubham/Downloads/chromedriver_linux64/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com");
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("shubham.verma1@tothenew.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("1234567");
		driver.findElement(By.xpath("//input[@name='login']")).click();
//		tripType
		driver.findElement(By.xpath("//input[@name='tripType']")).click();
		Select sel = new Select(driver.findElement(By.xpath("//select[@name='passCount']")));
		sel.selectByValue("2");
		Select n = new Select(driver.findElement(By.xpath("//select[@name='fromPort']")));
		n.selectByValue("New York");

		Select m = new Select(driver.findElement(By.xpath("//select[@name='fromMonth']")));
		m.selectByValue("3");

		Select d = new Select(driver.findElement(By.xpath("//select[@name='fromDay']")));
		d.selectByValue("29");
		Select t = new Select(driver.findElement(By.xpath("//select[@name='toPort']")));
		t.selectByValue("London");
		Select mo = new Select(driver.findElement(By.xpath("//select[@name='toMonth']")));
		mo.selectByValue("3");

		Select da = new Select(driver.findElement(By.xpath("//select[@name='toDay']")));
		da.selectByValue("24");
		driver.findElement(By.xpath("//input[@name='servClass']")).click();

		Select air = new Select(driver.findElement(By.xpath("//select[@name='airline']")));
		air.selectByVisibleText("Blue Skies Airlines");
		driver.findElement(By.xpath("//input[@name='findFlights']")).click();
		driver.findElement(By.xpath("//input[@name='reserveFlights']")).click();
		driver.findElement(By.xpath("//input[@name='passFirst0']")).sendKeys("Shubham");
		driver.findElement(By.xpath("//input[@name='passLast0']")).sendKeys("Verma");
		Select meal= new Select(driver.findElement(By.xpath("//select[@name='pass.0.meal']")));
		meal.selectByValue("HNML");
		Select card = new Select(driver.findElement(By.xpath("//select[@name='creditCard']")));
		card.selectByValue("BA");
		driver.findElement(By.xpath("//input[@name='creditnumber']")).sendKeys("123456789");;
		driver.findElement(By.xpath("//input[@name='buyFlights']")).click();


	}

}