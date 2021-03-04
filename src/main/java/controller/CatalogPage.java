package controller;

import base.ScriptBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class CatalogPage extends ScriptBase {

    public CatalogPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    public void catalogDisplay(WebDriver driver, String catalog){
        driver.findElement(By.xpath("//div[@aria-controls='"+catalog+"']")).isDisplayed();
    }
}
