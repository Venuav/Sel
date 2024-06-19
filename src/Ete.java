import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ete {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
  //      driver.get("https://www.ajio.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        Thread.sleep(2000);
  //      driver.navigate().to("https://www.amazon.com/");
        Thread.sleep(2000);
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.findElement(By.xpath("//input[@id='name']")).sendKeys("sel");
        driver.findElement(By.cssSelector("#alertbtn")).click();
        Alert alt= driver.switchTo().alert();
        String text=alt.getText();
        System.out.println(text);
        alt.accept();
        driver.quit();
        driver.switchTo().frame(0);
        driver.switchTo().defaultContent();
        
        
	}

}
