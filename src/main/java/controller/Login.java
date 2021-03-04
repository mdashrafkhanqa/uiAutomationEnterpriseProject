package controller;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Login {

    @FindBy(id= "signInJoinButton")
    WebElement signInTab;
    @FindBy(id = "utility-eplus-email")
    WebElement emailSendKey;
    @FindBy(id = "utility-eplus-password")
    WebElement passwordSendKey;
    @FindBy(css = "#enterprise-login > div > button")
    WebElement loginSubmit;
    @FindBy(css = "button.logout.text-btn")
    WebElement signOutTab;

    public Login(WebDriver driver){
        PageFactory.initElements(driver, this);
    }


    public void validLogin(WebDriver driver, String email, String password) throws InterruptedException{
        Thread.sleep(5000);
        Actions actions = new Actions(driver);
        actions.moveToElement(signInTab).click().perform();
        emailSendKey.sendKeys(email);
        passwordSendKey.sendKeys(password);
        loginSubmit.click();
        System.out.println("Successfully Logged In");
        Thread.sleep(5000);
        Actions actions1 = new Actions(driver);
        actions1.moveToElement(signOutTab).click().perform();
        System.out.println("Successfully Logged Out");
    }


}
