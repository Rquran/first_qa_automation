import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testing_links {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\MyChromeDriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/lenovo/Desktop/AutomationProject1/first.html");
		
		
		driver.findElement(By.id("tw")).click();
		Thread.sleep(5000);
		driver.navigate().back();
		
		driver.findElement(By.id("fb")).click();
		Thread.sleep(5000);
		driver.navigate().back();
		
		driver.findElement(By.id("ig")).click();
		Thread.sleep(5000);
		driver.navigate().back();

		driver.findElement(By.id("li")).click();
		Thread.sleep(5000);
		driver.navigate().back();


	}

}
