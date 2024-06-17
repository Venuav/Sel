import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.decorators.WebDriverDecorator;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.TakesScreenshot;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Alerts {

	/**
	 * @param args
	 * @throws InterruptedException
	 * @throws IOException 
	 */
	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
	//	System.setProperty("webdriver.chrome.driver","C:\\Users\\venua\\Documents\\chromedriver-win64.exe");
	//	WebDriverManager.chromedriver().setup(); 
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
      //driver.get("https://www.ajio.com/");
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement w=driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
		Select s=new Select(w);
		for(int i=0;i<=3;i++)
		{
		s.selectByIndex(i);
		Thread.sleep(3000);
		}
		Thread.sleep(3000);
		  File src=  ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		  FileUtils.copyFile(src, new File("C:\\Users\\venua\\screenshot.png"));
		  
		driver.findElement(By.xpath("//button[@id='openwindow']")).click();
		Set<String> window=driver.getWindowHandles();
		Iterator<String> it=window.iterator();
		String parent=it.next();
		String child=it.next();
		driver.switchTo().window(child);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//header/div[3]/div[1]/div[1]/div[1]/nav[1]/div[1]/ul[1]/li[2]/a[1]")).click();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,600)");
		Thread.sleep(3000);
	//	File src=((Takescreenshot)driver)
		
		driver.findElement(By.xpath("//header/div[3]/div[2]/form[1]/div[1]/div[1]/input[1]")).sendKeys("Kurta");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//header/div[3]/div[2]/form[1]/div[1]/button[1]/span[1]")).click();
		WebElement web=driver.findElement(By.xpath("//span[contains(text(),'HOME AND KITCHEN')]"));
		Actions act=new Actions(driver);
		act.moveToElement(web).doubleClick().build().perform();
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//header/div[1]/ul[1]/li[2]/a[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//strong[text()='LOGIN']")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[name='username']")).sendKeys("8217038850");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[value='Continue']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//header/div[1]/ul[1]/li[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[3]/label[2]/span[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("venu a v");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("venuav14056@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='Invite code (optional)']")).sendKeys("52526");
		driver.findElement(By.xpath("//span[@class='tnc']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@value='SEND OTP']")).click();
		driver.quit();

	}

}
