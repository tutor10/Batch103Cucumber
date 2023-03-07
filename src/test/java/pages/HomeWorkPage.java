package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HomeWorkPage {

  public HomeWorkPage(){
      PageFactory.initElements(Driver.getDriver(),this);
  }
  @FindBy(xpath = "//*[@class='btn btn-primary btn-sm']")
    public WebElement loginButton;

  @FindBy(id="formBasicEmail")
    public WebElement email;

  @FindBy(id="formBasicPassword" )
    public WebElement password;

  @FindBy(xpath = "//*[@type='submit']")
    public WebElement submitLoginButton;

  @FindBy(xpath = "//*[@type='button']")
  public WebElement button;
}
