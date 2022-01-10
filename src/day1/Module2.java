package day1;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Module2 

{
	@Test  
	 public void webLoginCarLoan()  
	 {  
	     System.out.println("WebLoginCarLoan"); 
	     Reporter.log("This is test is exluded");

	 }  
	 @Test  
	 public void MobileLoginCarLoan()  
	 {  
	     System.out.println("MobileLoginCarLoan"); 
	     Reporter.log("This is MobileLoginCarLoan Test is passed");
	 }  
	 @Test  
	 public void APILoginCarLoan()  
	 {  
	     System.out.println("APILoginCarLoan");
	     Reporter.log("This is APILoginCarLoan Test is passed");
	 }
	 @Test
	 public void webLogin()
	 {
		 System.out.println("WebLogin");
	     Reporter.log("This is test is exluded");

	 }

}
