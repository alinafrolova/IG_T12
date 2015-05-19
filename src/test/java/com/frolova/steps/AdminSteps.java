package com.frolova.steps;

import com.frolova.addition.Temp;
import com.frolova.pages.AdminPages;
import com.frolova.pages.CampaignPages;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.openqa.selenium.Cookie;

import java.util.Random;

import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.hasItem;
import static org.junit.Assert.assertThat;
/**
 * Created by Frolova.A on 5/12/15.
 */
public class AdminSteps extends ScenarioSteps {
    AdminPages adminPages;

    @Step
    ///////////////////////////////////////////////////////////////////////////////////////////
    public void loginAdmin(){
        adminPages.enterLoginPass("alina.frolova@maxymiser.com","Vfybyuty01011990z");
        adminPages.logInSubmit();
//        adminPages.choose_configuration_action_log();
    }
    @Step
    ///////////////////////////////////////////////////////////////////////////////////////////
    public void clearAdmin(){
        adminPages.clearActionLog();
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------");
    }
    /////////////////////////////////////////////////////////////////////////////////////////////
    @Step
    //////////////////////////////////////////////////////////////////////////////////////////
    public void openAdmin(){
        getDriver().manage().window().maximize();
        adminPages.open();

        }
    @Step
    //////////////////////////////////////////////////////////////////////////////////////////
    public void openActionLog(){
        adminPages.openActionLog();
       }

    @Step
    public void should_see_definition(String text,String definition) {
        assertThat(adminPages.getDefinitions(), hasItem(containsString(definition)));

    }

    CampaignPages campaignPages;

    ///////////////////////////////////////////////////////////
    String name = "MyIG" + Temp.randomtxt(4);
    String usern = "MyIG" +  Temp.randomtxt(4)+new Random().nextInt(999);
    String mail = "MyIG" + Temp.randomtxt(4) +new Random().nextInt(999)+ "@maxymiser.com";
    String ph = "95495758"+ new Random().nextInt(999);
    private Cookie mmcore;

    @Step
    //////////////////////////////////////////////////////////////////////////////////////////
    public void openSite(){
        getDriver().manage().window().maximize();
        campaignPages.open();}

    ///////////////////////////////////////////////////////////
    @Step
    public void fillDefaultStep(){
        //  campaignPages.addCookie(mmcore);
        campaignPages.check_cookie();
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
    ///////////////////////////////////////////////////////////
    @Step
    public void fillSecondtStep(){
        //  campaignPages.addCookie(mmcore);
        campaignPages.check_cookie();
        campaignPages.firstname(name);
        campaignPages.lastname(name);
        campaignPages.email(mail);
        campaignPages.bithDay2();
        campaignPages.bithMon2();
        campaignPages.bithYear2();
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
    ///////////////////////////////////////////////////////////
    @Step
    public void fillFirstStep(){
        campaignPages.bithDay();
        campaignPages.bithMon();
        campaignPages.bithYear();
        campaignPages.stepSubmit();
    }
    ///////////////////////////////////////////////////////////
    @Step
    public void fillTwotStep(){
        campaignPages.firstname(name);
        campaignPages.lastname(name);
        campaignPages.address1("test");
        campaignPages.postcode("8006466");
        campaignPages.city();
        campaignPages.phonenumber(ph);
        campaignPages.stepSubmit();
    }
    ///////////////////////////////////////////////////////////
    @Step
    public void fillThreetStep(){
        campaignPages.email(mail);
        campaignPages.passwordone();
        campaignPages.passwordtwo();
        campaignPages.username(usern);
        campaignPages.terms();
        campaignPages.three_submit();
    }
    ///////////////////////////////////////////////////////////
    @Step
    public void fillFirstA4Step(){
        campaignPages.firstname(name);
        campaignPages.lastname(name);
        campaignPages.email(mail);
        campaignPages.bithDay();
        campaignPages.bithMon();
        campaignPages.bithYear();
        campaignPages.stepSubmit();
    }
    ///////////////////////////////////////////////////////////
    @Step
    public void fillTwotA4Step(){

        campaignPages.address1("test");
        campaignPages.postcode("8006466");
        campaignPages.city();
        campaignPages.phonenumber(ph);
        campaignPages.stepSubmit();
    }
    ///////////////////////////////////////////////////////////
    @Step
    public void fillThreetA4Step(){

        campaignPages.passwordone();
        campaignPages.passwordtwo();
        campaignPages.username(usern);
        campaignPages.terms();
        campaignPages.three_submit();
    }
}
