package com.frolova.steps;

import com.frolova.pages.CampaignPages;
import com.frolova.pages.CreditCardPages;
import com.frolova.pages.DepositPages;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

/**
 * Created by Frolova.A on 5/19/15.
 */
public class DepositSteps extends ScenarioSteps {

    DepositPages depositPages;
    CreditCardPages creditCardPages;
    CampaignPages campaignPages;


    //////////////////////////////////////////////////////////////////////////////////////////
    public void do_deposit(){
        creditCardPages.open();
        String CARD = creditCardPages.get_generete_card();
        System.out.println("ADD CARD"+CARD);
        depositPages.open();
        campaignPages.addCookies();
        depositPages.add_amount("25.00");
        depositPages.add_card_number(CARD);
        depositPages.add_month();
        depositPages.add_cvv();
        depositPages.submit_page_deposit();
        depositPages.check_balance();
    }
    @Step
    //////////////////////////////////////////////////////////////////////////////////////////
    public void open_page_for_deposit(){
        getDriver().manage().window().maximize();
        depositPages.open();
        campaignPages.addCookies();

    }
}
