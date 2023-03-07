package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.HomeWorkHomePage;
import pages.HomeWorkPage;
import utilities.Driver;

public class HomeWorkStepDefinitions {

    HomeWorkPage homeWorkPage = new HomeWorkPage();
    HomeWorkHomePage homeWorkHomePage = new HomeWorkHomePage();

    @Given("kullanici sayfa {string} gider")
    public void kullanici_sayfa_gider(String string) {

        Driver.getDriver().get(string);
    }
    @When("kullanici login sayfasina gider")
    public void kullanici_login_sayfasina_gider() {

        homeWorkPage.loginButton.click();
    }

    @When("kullanıcı {string} girer")
    public void kullanıcı_girer(String string) {
        homeWorkPage.email.sendKeys(string);

    }
    @When("kullanici {string} girer")
    public void kullanici_girer(String string) {
        homeWorkPage.password.sendKeys(string);

    }
    @When("kullanici login butonunu tiklar")
    public void kullanici_login_butonunu_tiklar() {
        homeWorkPage.submitLoginButton.click();
    }




    @Then("login girisinin basarili {string} oldugunu test et")
    public void login_girisinin_basarili_oldugunu_test_et(String string) {
        Assert.assertTrue(homeWorkHomePage.userID.isDisplayed());
    }
}
