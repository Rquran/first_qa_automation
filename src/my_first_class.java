import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class my_first_class {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\MyChromeDriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("file:///C:/Users/lenovo/Desktop/mywebsite/index.html");

		driver.findElement(By.id("email-input")).sendKeys("Razan@gmail.com");
		driver.findElement(By.id("password-input")).sendKeys("Razan@412000");
		driver.findElement(By.id("date-input")).sendKeys("04/01/2000");
		driver.findElement(By.id("mobile-input")).sendKeys("+962772934194");
		driver.findElement(By.tagName("button")).click();

	}

}
