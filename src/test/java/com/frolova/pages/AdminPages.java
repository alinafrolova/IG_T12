package com.frolova.pages;

import ch.lambdaj.function.convert.Converter;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

import static ch.lambdaj.Lambda.convert;

/**
 * Created by Frolova.A on 4/28/15.
 */

@DefaultUrl("https://ui61.maxymiser.com/Admin/account-unibet/525/site-maria-com/845/ActionLog")
public class AdminPages extends PageObject {
    private WebDriver driver;
    private String adminCamp,checkCamp,baseUrl,m;

    @Before
    public void setUp(){

        adminCamp = "https://ui61.maxymiser.com/Admin/account-unibet/525/site-maria-com/845/ActionLog";

    }
    @FindBy(id = "Login")
    private WebElementFacade login;


    @FindBy(id = "Password")
    private WebElementFacade password;

    @FindBy(css = "div.auth-line > #Login")
    private WebElementFacade submit;

    @FindBy(id = "bDropToArchive")
    private WebElementFacade clear;

    ///////////////////////////////////////////////////////////////////////////////////////////

    public void enterLoginPass(String log, String pass){
        login.sendKeys(log);
        password.sendKeys(pass);
    }
    ///////////////////////////////////////////////////////////////////////////////////////////
    public void logInSubmit(){
        submit.click();
    }
    ///////////////////////////////////////////////////////////////////////////////////////////
    public void clearActionLog(){
        clear.click();

    }

    public void openActionLog() {
        getDriver().get("https://ui61.maxymiser.com/Admin/account-unibet/525/site-maria-com/845/ActionLog/AjaxLoadGrid?configType=Sandbox&ipCategory=OWN_IP&_");
    }
    /////////////////////////////////////////////////////////////////////////////////////////////
    public List<String> getDefinitions() {
        WebElementFacade definitionList = find(By.tagName("body"));
        List<WebElement> results = definitionList.findElements(By.tagName("pre"));
        System.out.println(results);
        return convert(results, toStrings());
    }
    /*String results = getDriver().getPageSource();
        System.out.println(results);
        return convert(results, toStrings());*/
    /////////////////////////////////////////////////////////////////////////////////////////////
    private Converter<WebElement, String> toStrings() {
        return new Converter<WebElement, String>() {
            public String convert(WebElement from) {
                return from.getText();
            }
        };
    }

}
