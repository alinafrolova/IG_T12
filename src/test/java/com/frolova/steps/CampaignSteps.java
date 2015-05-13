package com.frolova.steps;

import com.frolova.addition.Temp;
import com.frolova.pages.CampaignPages;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.openqa.selenium.Cookie;

import java.util.Random;

/**
 * Created by Frolova.A on 4/29/15.
 */
public class CampaignSteps extends ScenarioSteps {
  CampaignPages campaignPages;

    ///////////////////////////////////////////////////////////
    String name = "igame" + Temp.randomtxt(4);
    String usern = "igame" +  Temp.randomtxt(4)+new Random().nextInt(999);
    String mail = "igame" + Temp.randomtxt(4) +new Random().nextInt(999)+ "@maxymiser.com";
    String ph = "95135758"+ new Random().nextInt(999);
    private Cookie mmcore;

    @Step
    //////////////////////////////////////////////////////////////////////////////////////////
    public void openSite(){
        getDriver().manage().window().maximize();
        campaignPages.open();}

    ///////////////////////////////////////////////////////////
    @Step
    public void fillFirstStep(){
      //  campaignPages.addCookie(mmcore);
        campaignPages.firstname(name);
        campaignPages.lastname(name);
        campaignPages.email(mail);
        campaignPages.bithDay();
        campaignPages.bithMon();
        campaignPages.bithYear();
        campaignPages.address1("test");
        campaignPages.postcode("8006466");
        campaignPages.city();
        campaignPages.phonenumber(ph);
        campaignPages.passwordone();
        campaignPages.passwordtwo();
        campaignPages.username(usern);
        campaignPages.terms();
        campaignPages.submit();
    }







}
