package Testng;

import org.testng.annotations.Test;

public class Firsttest {
   @Test(dependsOnMethods="secondMethod")
   public void firstMethod()
   {
	   System.out.println("Executing the first method");
   }
   
   @Test()
   public void secondMethod()
   {
   System.out.println("Executing the second method");
   }
}
