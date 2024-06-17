import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Practice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
        driver.get("https://omayo.blogspot.com/");
       WebElement drop= driver.findElement(By.xpath("//select[@id='drop1']"));
        Thread.sleep(4000);
        Select s=new Select(drop);
        s.selectByValue("def");
        Thread.sleep(4000);
        driver.findElement(By.xpath("//input[@id='alert1']")).click();
        Alert alert=driver.switchTo().alert();
        alert.accept();
        Thread.sleep(4000);
        
        driver.quit();
	}

}
