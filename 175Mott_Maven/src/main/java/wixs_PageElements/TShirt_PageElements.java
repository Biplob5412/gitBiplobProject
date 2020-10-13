package wixs_PageElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Driver;

public class TShirt_PageElements extends Driver {

	public TShirt_PageElements(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="(//ul[@id='comp-jzh2krc5moreContainer'])")
	public WebElement firstProduct;
	
	
	@FindBy(xpath= "(//*[text()='Add To Cart'])")
	public WebElement addToCart;
	
	@FindBy(id="widget-view-cart-button")
	public WebElement cartLink;
	
	@FindBy(id="tpaPopup-k1nqbrjwiframe")
	public WebElement CartFrame;
	
	@FindBy(xpath="//*[@id='widget-view-cart-button']")
	public WebElement viewCartLink;
	
	
	
	

}
