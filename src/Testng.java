import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Testng {
    @Test(dataProvider="mysecondtestng")
    public void myfirsttestng(String name,String email) throws InterruptedException
    {
    	ChromeDriver driver=new ChromeDriver();
    	driver.get("https://www.ajio.com/");
    	Thread.sleep(4000);
    	driver.findElement(By.xpath("//span[@id='loginAjio']")).click();
    	driver.findElement(By.xpath("//header/div[1]/ul[1]/li[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[2]/div[1]/label[1]/input[1]")).sendKeys("8217038850");
    	Thread.sleep(4000);
    	driver.findElement(By.xpath("//header/div[1]/ul[1]/li[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[2]/div[2]/input[1]")).click();
    	Thread.sleep(4000);
    	driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/header[1]/div[1]/ul[1]/li[1]/div[1]/div[1]/div[1]/div[2]/div[1]/span[1]")).click();
    	Thread.sleep(4000);
    	
    	driver.findElement(By.xpath("//header/div[1]/ul[1]/li[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[2]/div[1]/label[1]/input[1]")).sendKeys("8217038850");
    	Thread.sleep(4000);
    	driver.findElement(By.xpath("//header/div[1]/ul[1]/li[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[2]/div[2]/input[1]")).click();
    	Thread.sleep(4000);
    	driver.findElement(By.xpath("//header/div[1]/ul[1]/li[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[3]/label[2]/span[1]")).click();
    	Thread.sleep(3000);
    	driver.findElement(By.xpath("//header/div[1]/ul[1]/li[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[5]/input[1]")).sendKeys(name);
    	Thread.sleep(3000);
    	driver.findElement(By.xpath("//header/div[1]/ul[1]/li[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[7]/input[1]")).sendKeys(email);
    	Thread.sleep(3000);
    	driver.findElement(By.xpath("//input[@id='tncCheckbox']")).click();
    	System.out.println();
    	driver.findElement(By.xpath("//header/div[1]/ul[1]/li[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[12]/input[1]")).click();
    	driver.quit();
    }
    @DataProvider
    public String[][] mysecondtestng()
    {
    	String[][]data= {{"venu","venuav14056@gmail.com"},{"venua","venudevops27@gmail.com"}};
    	return data;
    }
}

    

