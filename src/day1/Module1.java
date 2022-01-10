package day1;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Module1 

{
	@Test()     
    public void test1()                                          // First test case  
    {  
        System.out.println("Hello javaTpoint!!"); 
	     Reporter.log("Test1 is passed");

    }  
      
    @Test  
    public void test2()                                          // Second test case  
    {  
        System.out.println("JTP Travels"); 
	     Reporter.log("Test2 is passed");

    }
}
