package chapter3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pomLoginPage {

	
	//Declaration
	@FindBy(className="atLogoImg")
	private WebElement logo;
	
	@FindBy(name="username")
	private WebElement user;
	
	@FindBy(name="pwd")
	private WebElement password;
	
	@FindBy(id="loginButton")
	private WebElement loginbutton;
	
	@FindBy(id="keepLoggedInCheckBox")
	private WebElement KeepMeLogedCB;
	
	@FindBy(partialLinkText="Forgot")
	private WebElement forgtpassLink;
	
	@FindBy(xpath="//span[contains(text(),'Username or Password')]")
	private WebElement errormsg;
	
	//initialization
	public pomLoginPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
		
	}
	
	//utilization
	public WebElement getLogo(){
		return logo;
	}
	
	public void setUsername(String username) {
		user.sendKeys(username);
		
	}
	
	public void setpassword(String pasword) {
		password.sendKeys(pasword);
	}
	
	public WebElement getLoginButton() {
		return loginbutton;
	}
	
	public void clickLogin() {
	loginbutton.click();
	}
	public void keepmeloggedin() {
		KeepMeLogedCB.click();
	}
	
	
	
	
		
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
