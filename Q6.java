
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class Q6 {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver","/home/shubham/Downloads/chromedriver_linux64/chromedriver");
			WebDriver driver = new ChromeDriver();
		    driver.get("https://www.tothenew.com");
		    driver.findElement(By.xpath("(//a[@id='h-contact-us'])[2]")).click();
		    System.out.println(driver.getCurrentUrl());
		 
		}

	}
