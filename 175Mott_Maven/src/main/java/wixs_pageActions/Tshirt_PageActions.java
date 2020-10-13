package wixs_pageActions;

import org.openqa.selenium.WebDriver;

import wixs_PageElements.TShirt_PageElements;

public class Tshirt_PageActions extends TShirt_PageElements {

	public Tshirt_PageActions(WebDriver driver) {
		super(driver);
		staticWait(3);
	}
	
	public void selectFirstProductAndAddToCart() {
		
		click(firstProduct);
		click(addToCart);
	}
	
	public CartPageActions navigateToCart() {
		staticWait();
		try {
		click(cartLink);}
		
		catch(Throwable t) {}
		staticWait(3);
		SwithToFrame(1);
		click(viewCartLink);
		switchDefaultContent();
		return new CartPageActions(driver);
		
		
	}

	public void verifyTshirtPageLoad() {
		verifyEquals(" T-Shirt | Kamol inc", getPageTitle());
		verifyEquals(" https://kamoleshbachar.wixsite.com/website/t-shirt", getCurrentUrl());
		
	}

}
