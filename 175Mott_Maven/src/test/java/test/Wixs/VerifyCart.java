package test.Wixs;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import test.BaseTest;
import wixs_pageActions.CartPageActions;
import wixs_pageActions.HomePageActions;
import wixs_pageActions.Tshirt_PageActions;

public class VerifyCart extends BaseTest {
	
	HomePageActions homePageActions=null;
	
	@BeforeMethod
	
	public void b() {
		
		homePageActions= new HomePageActions(driver);
	}
	@Test
	public void cart() {
	homePageActions.verifyHomePageLoad();
	
	Tshirt_PageActions tshirtPageActions= homePageActions.navigateToTshirt();
	
	tshirtPageActions.verifyTshirtPageLoad();
	
	tshirtPageActions.selectFirstProductAndAddToCart();
	CartPageActions cartPageACtions=tshirtPageActions.navigateToCart();
	
	cartPageACtions.verifyCartPageLoad();
}
}
