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
public class A4_NoSSN_3Step {
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
        adminSteps.fillFirstA4Step();
        adminSteps.fillTwotA4Step();
        adminSteps.fillThreetA4Step();
    }
    @Test
    @WithDriver("internetexplorer")
    public void c_find_actiona_in_action_log(){
        adminSteps.openAdmin();

        adminSteps.openActionLog();
        adminSteps.should_see_definition("Campaign- ","T12a_3_Step_Reg_Sweden");
         adminSteps.should_see_definition("Content- ","a_page=a4_nossn_3step;");
        adminSteps.should_see_definition("Action- ","t12a_stepone=1,unique;");
        adminSteps.should_see_definition("Action- ","t12a_steptwo=1,unique;");
        adminSteps.should_see_definition("Action- ","t12a_stepthree=1,unique;");
        adminSteps.should_see_definition("Action- ","t12a_registration=1,unique;");
        // adminSteps.should_see_definition("Action- ","t12a_firstdeposit=1,unique;");

    }
}
