import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Q1 {

public static void main(String[] args) {
	
		// TODO Auto-generated method stub
System.setProperty("webdriver.gecko.driver","/home/shubham/Downloads/geckodriver-v0.26.0-linux64/geckodriver");
WebDriver driver = new FirefoxDriver();
	driver.get("https://www.google.com/");
	}
}