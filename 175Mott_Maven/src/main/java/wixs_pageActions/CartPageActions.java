package wixs_pageActions;

import org.openqa.selenium.WebDriver;

import wixs_PageElements.CartPageElements;

public class CartPageActions  extends CartPageElements {

	public CartPageActions(WebDriver driver) {
		super(driver);
		staticWait(3);
	}
	
	public void  verifyCartPageLoad(){
		verifyEquals("cart|website",getPageTitle());
		
		contentEquals("http://kamoleshbachar.wixsite.com/website/cart?",getCurrentUrl());
		
	}
	

}
