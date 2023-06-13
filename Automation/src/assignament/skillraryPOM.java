package assignament;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class skillraryPOM extends skillrarybase{


	//open browser
	//enter skillrary.com
	//click gears tab
	//click on skillrary demo app
	//mouse over to course tab
	//select "selenium training"
	//double click on + button
	//click on add to cart
	//handle alert popup 
	//close the tab
	@FindBy(xpath="//button[text()='Accept']")
	private WebElement accept;

	@FindBy(xpath="//a[text()=' GEARS ']")
	private WebElement gear;
	
	@FindBy(xpath="//ul[@class='dropdown-menu gear_menu']/li[7]/a")
	private WebElement skilldemo;
	
	@FindBy(xpath="//a[text()='COURSE']") WebElement course;
	
	@FindBy(xpath="//span[@class=\"wrappers\"]/a[text()='Selenium Training']")
	private WebElement seleniumtrain;
	
	@FindBy(id="add")
	private WebElement addbutton;
	
	@FindBy(xpath="//button[@ondblclick='addtocart()']")
	private WebElement addcartbutton;
	
	//initialisation
	public skillraryPOM(WebDriver driver) {
		PageFactory.initElements(driver,this);
			
	}
	
	//utilisation
	public void accpt() {
		accept.click();
	}
	public void clickGear(){
		
		gear.click();
	}
	
	public void clickskilldemo() {
		skilldemo.click();
	}
	
	public void movetocourse() {
		Actions a=new Actions(driver);
		a.moveToElement(course).perform();
	}
	
	public void clickseleniumtrain() {
		seleniumtrain.click();
		
	}
	
	public void clickaddbutton() {
		addbutton.click();
	}
	
	public void clickaddcartbutton() {
		addcartbutton.click();
	}
	
	public void handlealert() {
		Alert a1=driver.switchTo().alert();
		a1.accept();
	}
	
		

	
	
}
