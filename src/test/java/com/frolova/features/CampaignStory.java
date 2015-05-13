package com.frolova.features;


import com.frolova.steps.AdminSteps;
import com.frolova.steps.CampaignSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

/**
 * Created by Frolova.A on 4/29/15.
 */
@RunWith(SerenityRunner.class)
public class CampaignStory {

    @Managed(driver="chrome")
    public WebDriver webdriver;


    @Steps
    CampaignSteps campaignSteps;
    AdminSteps adminSteps;

    @Test
    public void work_with_admin(){

        adminSteps.openAdmin();
        adminSteps.loginAdmin();
        adminSteps.clearAdmin();
    }

    @Test
            public void find_actions_in_admin(){
        adminSteps.openAdmin();
        adminSteps.loginAdmin();
        adminSteps.openActionLog();
        adminSteps.should_see_definition("Campaign- ","T02a_Registration_AB");
        adminSteps.should_see_definition("Content- ","a_register=Default;");
        adminSteps.should_see_definition("Action- ","startreg=1,unique;");
        adminSteps.should_see_definition("Action- ","stepone=1,unique;");
        adminSteps.should_see_definition("Action- ","steptwo");
        adminSteps.should_see_definition("Action- ","registration=1,unique;");

    }
    @Test
    public void work_with_campaign(){
        campaignSteps.openSite();
        campaignSteps.fillFirstStep();
    }

}
