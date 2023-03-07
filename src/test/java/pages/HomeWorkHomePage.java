package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HomeWorkHomePage {

    public HomeWorkHomePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(id="dropdown-basic-button")
    public WebElement userID;
}

