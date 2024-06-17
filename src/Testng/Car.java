package Testng;

import org.testng.Assert;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Car {
	
   @Parameters({"URL"})
   @Test()
   public void carModel(String URL)
   {
	   System.out.println("Executing the carmodel name"+ URL);
	 //  Assert.assertTrue(false)
   }
   
   @Test()
   public void carCost()
   {
	   System.out.println("Printing cardcost");
   }
}
