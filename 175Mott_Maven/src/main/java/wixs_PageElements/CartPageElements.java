package wixs_PageElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Driver;

public class CartPageElements extends Driver {

	public CartPageElements(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver,this);
	}
	
	
}
