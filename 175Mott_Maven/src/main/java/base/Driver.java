package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Driver {
	
	public WebDriver driver=null;
	
	public Driver(WebDriver driver) {
		this.driver= driver;
			
	}
	//Create several method for further Use
	
	public void click(WebElement element) {
		
		if (isDisplayed( element)) {
			
			element.click();
			System.out.println("Element click Successfully");
		}
		else {
		}	
	}
	public boolean isDisplayed(WebElement element) {
		return element.isDisplayed();
	}
	
	public void addText(WebElement element, String text) {
		element.clear();
		element.sendKeys(text);
	}
	
	public boolean verifyEquals( String expected,String actual) {
		
		boolean b= expected.equalsIgnoreCase(actual);
		System.out.println(b+ "Expected" +expected+ "Actual"+ actual);
		return b;
	}
	
	public boolean contentEquals( String expected, String actual) {
		
	return actual.contentEquals(expected);
	}
	
public String getCurrentUrl() {
	
	String Url =driver.getCurrentUrl();
	System.out.println(Url);
	return Url;
	
} 

public String getPageTitle(){
	String title=driver.getTitle();
	System.out.println(title);
	return title;	
}

public void hoverOnMenuAndSubMenu(WebElement menu,WebElement subMenu) {
	Actions actions= new Actions(driver);
	actions.moveToElement(menu).build().perform();
	staticWait(5);
	click(subMenu);
	
}

public void staticWait(int sec) {
	
	try {
		Thread.sleep(sec * 1000);
		}
	catch(InterruptedException e) {
		e.printStackTrace();
	}
}
	
	public void staticWait() {
		staticWait(1);
	}
	public void SwithToFrame(WebElement element) {
		driver.switchTo().frame(element);
	}
	
	public void SwithToFrame(int index) {
		driver.switchTo().frame(index);
	}
	
	public void switchDefaultContent() {
		driver.switchTo().defaultContent();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
