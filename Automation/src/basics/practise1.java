package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class practise1 extends practic100{

	
	@FindBy(className="atLogoImg")
	private WebElement logo;

	@FindBy(id="username")
	private WebElement usernameTF;
	
	@FindBy(name="pwd")
	private WebElement passwordTF;
	
	@FindBy(name="remember")
	private WebElement checkbox;
	
	@FindBy(id="loginButton")
	private WebElement loginbutton;
	
 //initialising
	public practise1(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	
	//utilisation
	
	public WebElement getlogo() {
		return logo;
	}
	public void setusername(String username) {
		usernameTF.sendKeys(username);
	}
	
	public void setpassword(String password) {
		passwordTF.sendKeys(password);
	
	}
	public void clickcb() {
		checkbox.click();
	}
	
	public void clicklogin() {
		loginbutton.click();
	}
	
	
	
}
