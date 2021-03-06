package com.frolova.features;

import com.frolova.steps.AdminSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.WithDriver;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

/**
 * Created by Frolova.A on 5/14/15.
 */
@RunWith(SerenityRunner.class)
public class A3_SSN_3StepStory {
    @Managed(uniqueSession = true)
    public WebDriver webdriver;


    @Steps
    AdminSteps adminSteps;

    @Test
    @WithDriver("chrome")
    public void b_work_with_campaign(){
        adminSteps.openAdmin();
        adminSteps.loginAdmin();
        adminSteps.clearAdmin();
        adminSteps.openSite();
        adminSteps.fillFirstStep();
        adminSteps.fillTwotStep();
        adminSteps.fillThreetStep();
    }
    @Test
    @WithDriver("chrome")
    public void find_action_in_action_log_for_a3_variant(){
        adminSteps.openAdmin();
        adminSteps.openActionLog();
        adminSteps.should_see_definition("Campaign- ","T12a_3_Step_Reg_Sweden");
        adminSteps.should_see_definition("Content- ","a_page=a3_ssn_3step;");
       adminSteps.should_see_definition("Action- ","t12a_stepone=1,unique;");
        adminSteps.should_see_definition("Action- ","t12a_steptwo=1,unique;");
        adminSteps.should_see_definition("Action- ","t12a_stepthree=1,unique;");
        adminSteps.should_see_definition("Action- ","t12a_registration=1,unique;");
        // adminSteps.should_see_definition("Action- ","t12a_firstdeposit=1,unique;");

    }
}
