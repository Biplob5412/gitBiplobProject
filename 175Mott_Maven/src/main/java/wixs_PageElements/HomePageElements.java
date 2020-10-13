package wixs_PageElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Driver;

public class HomePageElements extends Driver {

	public HomePageElements(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//p[@id='comp-jzh2krc52label']")
	public WebElement Men_Menu;
	
	@ FindBy(xpath="//p[@id='comp-jzh2krc5moreContainer0label']")
	public WebElement  TShirt_Submenu;
	
	//@FindBy(xpath="//ul[@id='comp-jzh2krc5moreContainer']")
	//public WebElement Punjabi_Submenu;

}
