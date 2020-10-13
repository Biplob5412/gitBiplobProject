package wixs_pageActions;

import org.openqa.selenium.WebDriver;

import wixs_PageElements.HomePageElements;

public class HomePageActions extends HomePageElements {

	public HomePageActions(WebDriver driver) {
		super(driver);}
		
		
		public void verifyHomePageLoad() {
			verifyEquals("Home | Kamol inc",getPageTitle());
			
			
			verifyEquals("https://kamoleshbachar.wixsite.com/website",getCurrentUrl());
			
		}
		
		
		public Tshirt_PageActions navigateToTshirt() {
			
			hoverOnMenuAndSubMenu(Men_Menu,TShirt_Submenu);
			return  new Tshirt_PageActions(driver);
			
	
			
			
		}
	}


