import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/home/shubham/Downloads/chromedriver_linux64/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(" https://www.ultimateqa.com/simple-html-elements-for-automation/");
		System.out.println(driver.findElement(By.xpath("//div[@class='et_pb_text_inner']/table/tbody/tr[4]/td[3][1]")).getText());

	}

}