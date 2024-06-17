import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
	  //  System.setProperty("webdriver.chrome.driver", "C:\\Users\\venua\\Downloads\\chrome-headless-shell-win64\".exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com");
		WebElement ele = driver.findElement(By.xpath("//a[text()='Register']"));
		ele.click();
		String ele3=driver.getPageSource();
		System.out.println(ele3);
		WebElement ele1 = driver.findElement(By.xpath("//button[text()=' Sign up with email']"));
		ele1.click();
	//	WebElement ele3 = driver.findElement(By.xpath("//button[text()=' Sign up with email']"));
	//	ele3.click();
	//	ele3.click();
		driver.close();
	}

}
