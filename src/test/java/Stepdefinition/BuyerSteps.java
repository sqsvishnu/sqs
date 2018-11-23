package Stepdefinition;

import org.junit.Test;

public class BuyerSteps {

	HomePage homePage = new HomePage();                                          
    
	 @Test//@Step                                                       
	    public void opens_etsy_home_page() {
	        homePage.open();
	    }
   
  
}
