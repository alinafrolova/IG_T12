package com.frolova.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.junit.Before;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;

/**
 * Created by Frolova.A on 4/29/15.
 */
@DefaultUrl("https://www.igame.com/sv/signup/?mmcore.opc.enabled=1&mmcore.cfgid=1")
public class CampaignPages extends PageObject {
    private WebDriver driver;
    private String adminCamp,checkCamp,baseUrl,m;

    @Before
    public void setUp(){

        baseUrl = "https://www.igame.com/sv/signup/?mmcore.opc.enabled=1";

    }
    //////////////////////////////////fields
    @FindBy(id = "firstname")
    private WebElementFacade firstname;
    //////////////////////////////////
    @FindBy(id = "lastname")
    private WebElementFacade lastname;
    //////////////////////////////////
    @FindBy(id = "email")
    private WebElementFacade e_mail;
    //////////////////////////////////
    @FindBy(xpath = "(//button[@type='button'])[2]")
    private WebElementFacade dobD;
    //////////////////////////////////
    @FindBy(linkText = "4")
    private WebElementFacade chooseDay;
    //////////////////////////////////
    @FindBy(xpath = "(//button[@type='button'])[3]")
    private WebElementFacade dobM;
    //////////////////////////////////
    @FindBy(linkText = "Feb")
    private WebElementFacade chooseMon;
       //////////////////////////////////
    @FindBy(xpath = "(//button[@type='button'])[4]")
    private WebElementFacade dobY;
    //////////////////////////////////
    @FindBy(linkText = "1990")
    private WebElementFacade chooseYear;
    //////////////////////////////////
    @FindBy(id = "address1")
    private WebElementFacade address1;
    //////////////////////////////////
    @FindBy(id = "city")
    private WebElementFacade city;
    //////////////////////////////////
    @FindBy(id = "postcode")
    private WebElementFacade postcode;
    //////////////////////////////////
    @FindBy(id = "username")
    private WebElementFacade username;
    //////////////////////////////////
    @FindBy(id = "phonenumber")
    private WebElementFacade phonenumber;
    //////////////////////////////////
    @FindBy(id = "passwordone")
    private WebElementFacade passwordone;
    //////////////////////////////////
    @FindBy(id = "passwordtwo")
    private WebElementFacade passwordtwo;
    //////////////////////////////////deposit field
    @FindBy(id = "amount")
    private WebElementFacade amount;
    //////////////////////////////////button
    @FindBy(id = "terms")
    private WebElementFacade terms ;
    /////////////////////////////////
    @FindBy(css = "#signupBtn > strong")
    private WebElementFacade submit;
    /////////////////////////////////
    /////////////////////////////////
    Cookie mmcore = new Cookie("mmcore.opc.enabled", "1");
    Cookie cfgid = new Cookie("mmcore.cfgid", "1");
    /////////////////////////////////
    ///////////////////////////////////////////////////////////////////////////////////////////
    public void firstname(String name){
        firstname.clear();
        firstname.sendKeys(name);
    }
    ///////////////////////////////////////////////////////////////////////////////////////////
    public void lastname(String name){
        lastname.clear();
        lastname.sendKeys(name);
    }

    ///////////////////////////////////////////////////////////////////////////////////////////
    public void email(String email){
        e_mail.clear();
        e_mail.sendKeys(email);
    }

    ///////////////////////////////////////////////////////////////////////////////////////////
    public void bithDay(){

        dobD.click();
        chooseDay.click();
    }
    ///////////////////////////////////////////////////////////////////////////////////////////
    public void bithMon(){

        dobM.click();
        chooseMon.click();
    }
    ///////////////////////////////////////////////////////////////////////////////////////////
    public void bithYear(){

        dobY.click();
        chooseYear.click();
    }
    ///////////////////////////////////////////////////////////////////////////////////////////
    public void address1(String add){
        address1.clear();
        address1.sendKeys(add);
    }
    ///////////////////////////////////////////////////////////////////////////////////////////
    public void postcode(String code){
        postcode.clear();
        postcode.sendKeys(code);
    }
    ///////////////////////////////////////////////////////////////////////////////////////////
    public void city(){
        city.clear();
        city.sendKeys("London");
    }
    ///////////////////////////////////////////////////////////////////////////////////////////
    public void phonenumber(String ph){
        phonenumber.clear();
        phonenumber.sendKeys(ph);
    }
    ///////////////////////////////////////////////////////////////////////////////////////////
    public void passwordone(){
        passwordone.clear();
        passwordone.sendKeys("qwerty123");
    }
    ///////////////////////////////////////////////////////////////////////////////////////////
    public void username(String usern){
        username.clear();
        username.sendKeys(usern);
    }
    ///////////////////////////////////////////////////////////////////////////////////////////
    public void passwordtwo(){
        passwordtwo.clear();
        passwordtwo.sendKeys("qwerty123");
    }
    ///////////////////////////////////////////////////////////////////////////////////////////
    public void submit(){
        submit.click();
    }
    ///////////////////////////////////////////////////////////////////////////////////////////
    public void terms(){
        terms.click();
    }
    ///////////////////////////////////////////////////////////////////////////////////////////
    public void addCookies(){

        driver.manage().addCookie(mmcore);
        System.out.println("enabled");
        driver.manage().addCookie(cfgid);
        driver.navigate().refresh();
    }
    ///////////////////////////////////////////////////////////////////////////////////////////
    public void clearActionLog(){
       // clear.click();

    }



}
