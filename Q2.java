import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/home/shubham/Downloads/chromedriver_linux64/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
	}

}
