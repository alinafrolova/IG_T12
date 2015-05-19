package com.frolova.steps;

import com.frolova.pages.CampaignPages;
import com.frolova.pages.CreditCardPages;
import net.thucydides.core.steps.ScenarioSteps;

/**
 * Created by Frolova.A on 5/19/15.
 */
public class DepositSteps extends ScenarioSteps {
    CampaignPages campaignPages;
    CreditCardPages creditCardPages;
    //////////////////////////////////////////////////////////////////////////////////////////
    public void do_deposit(){
        campaignPages.add_amount("50");
        campaignPages.add_card_number("4123207269766528");
        campaignPages.add_month();
        campaignPages.add_cvv();
        campaignPages.submit_page_deposit();
    }
}
