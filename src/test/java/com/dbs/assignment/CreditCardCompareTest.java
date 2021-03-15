package com.dbs.assignment;

import static org.testng.Assert.assertTrue;
import java.net.MalformedURLException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.auto.support.BaseController;
import com.auto.support.TestDetails;
import com.auto.support.WebElementLibrary;

public class CreditCardCompareTest extends BaseController {
	
	public WebDriver driver = null;

	@Test
	@TestDetails(description = "Credit Card comparison")
	public void test_compare_credit_card_details() throws MalformedURLException {
		this.driver = getDriver();
		Assert.assertEquals(driver.getTitle(), "Bank Accounts, Cards, Loans, Financial Planning | DBS Singapore",
				"Page Title Mismatch for default page");
		
		//Click on Cards on top.
		actionUtils.click(WebElementLibrary.LINK_CARDS, driver);
		//Wait for page loading.
		actionUtils.waitForPageLoadingJs(driver);
		
		//Click on Credit Cards
		actionUtils.click(WebElementLibrary.LINK_CREDIT_CARDS, driver);
		//Wait for page loading.
		actionUtils.waitForPageLoadingJs(driver);
		
		//Select 2 cards to make comparison.
		actionUtils.scrollByVisibleElement(WebElementLibrary.CHECK_1, driver);
		actionUtils.clickJs(WebElementLibrary.CHECK_1, driver);
		actionUtils.scrollByVisibleElement(WebElementLibrary.CHECK_1, driver);
		actionUtils.clickJs(WebElementLibrary.CHECK_2, driver);
		
		// Click Compare button
		actionUtils.scrollByVisibleElement(WebElementLibrary.BTN_COMPARE_CARDS, driver);
		actionUtils.clickJs(WebElementLibrary.BTN_COMPARE_CARDS, driver);
		actionUtils.waitForPageLoadingJs(driver);
		
		// Assertions
		// Check if all required Headings Available
		// Best For
		actionUtils.scrollByVisibleElement(WebElementLibrary.LABEL_BEST_FOR, driver);
		String actualBestFor = actionUtils.getInputValue(WebElementLibrary.LABEL_BEST_FOR, driver);
		Assert.assertEquals(actualBestFor, "Best For","Heading Mismatch for value 'Best for'");
		
		// Card Type
		actionUtils.scrollByVisibleElement(WebElementLibrary.LABEL_CARD_TYPE, driver);
		String actualCardType = actionUtils.getInputValue(WebElementLibrary.LABEL_CARD_TYPE, driver);
		Assert.assertEquals(actualCardType, "Card Type","Heading Mismatch for value 'Card Type'");
		
		// Min Income Per Annum
		actionUtils.scrollByVisibleElement(WebElementLibrary.LABEL_MIN_INCOME, driver);
		String actualMinIncomePerAnnum = actionUtils.getInputValue(WebElementLibrary.LABEL_MIN_INCOME, driver);
		Assert.assertEquals(actualMinIncomePerAnnum, "Min Income Per Annum","Heading Mismatch for value 'Min Income Per Annum'");
		
		// Min Income Per Annum Foreigners
		actionUtils.scrollByVisibleElement(WebElementLibrary.LABEL_MIN_INCOME_FOREIGNERS, driver);
		String actualMinIncomePerAnnumForeigners = actionUtils.getInputValue(WebElementLibrary.LABEL_MIN_INCOME_FOREIGNERS, driver);
		Assert.assertEquals(actualMinIncomePerAnnumForeigners, "Min Income Per Annum Foreigners","Heading Mismatch for value 'Min Income Per Annum Foreigners'");
		
		// Annual Fee Waiver
		actionUtils.scrollByVisibleElement(WebElementLibrary.LABEL_ANNUAL_FEE_WAIVER, driver);
		String actualAnnualFeeWaiver = actionUtils.getInputValue(WebElementLibrary.LABEL_ANNUAL_FEE_WAIVER, driver);
		Assert.assertEquals(actualAnnualFeeWaiver, "Annual Fee Waiver","Heading Mismatch for value 'Annual Fee Waiver'");
		
		// Check if Values corresponding to headings are populated (Not Blank)
		// Best For
		actionUtils.scrollByVisibleElement(WebElementLibrary.LABEL_BEST_FOR, driver);
		String bestForValueC1 = actionUtils.getInputValue(WebElementLibrary.LABEL_BEST_FOR_CARD1, driver);
		String bestForValueC2 = actionUtils.getInputValue(WebElementLibrary.LABEL_BEST_FOR_CARD2, driver);
		assertTrue(!bestForValueC1.isEmpty(), "Value for heading 'Best For' is not populated for card 1");
		assertTrue(!bestForValueC2.isEmpty(), "Value for heading 'Best For' is not populated for card 2");
		
		// Card Type
		actionUtils.scrollByVisibleElement(WebElementLibrary.LABEL_CARD_TYPE, driver);
		String cardTypeValueC1 = actionUtils.getInputValue(WebElementLibrary.LABEL_CARD_TYPE_CARD1, driver);
		String cardTypeValueC2 = actionUtils.getInputValue(WebElementLibrary.LABEL_CARD_TYPE_CARD2, driver);
		assertTrue(!cardTypeValueC1.isEmpty(), "Value for heading 'Card Type' is not populated for card 1");
		assertTrue(!cardTypeValueC2.isEmpty(), "Value for heading 'Card Type' is not populated for card 2");
		
		// Min Income Per Annum
		actionUtils.scrollByVisibleElement(WebElementLibrary.LABEL_MIN_INCOME, driver);
		String minIncomeValueC1 = actionUtils.getInputValue(WebElementLibrary.LABEL_MIN_INCOME_CARD1, driver);
		String minIncomeValueC2 = actionUtils.getInputValue(WebElementLibrary.LABEL_MIN_INCOME_CARD2, driver);
		assertTrue(!minIncomeValueC1.isEmpty(), "Value for heading 'Min Income' is not populated for card 1");
		assertTrue(!minIncomeValueC2.isEmpty(), "Value for heading 'Min Income' is not populated for card 2");
		
		// Min Income Per Annum Foreigners
		actionUtils.scrollByVisibleElement(WebElementLibrary.LABEL_MIN_INCOME_FOREIGNERS, driver);
		String minIncomePerAnnumForeignersValueC1 = actionUtils.getInputValue(WebElementLibrary.LABEL_MIN_INCOME_FOREIGNERS_CARD1, driver);
		String minIncomePerAnnumForeignersValueC2 = actionUtils.getInputValue(WebElementLibrary.LABEL_MIN_INCOME_FOREIGNERS_CARD2, driver);
		assertTrue(!minIncomePerAnnumForeignersValueC1.isEmpty(), "Value for heading 'Min Income Per Annum Foreigners' is not populated for card 1");
		assertTrue(!minIncomePerAnnumForeignersValueC2.isEmpty(), "Value for heading 'Min Income Per Annum Foreigners' is not populated for card 2");
		
		// Annual Fee Waiver
		actionUtils.scrollByVisibleElement(WebElementLibrary.LABEL_ANNUAL_FEE_WAIVER, driver);
		String annualFeeWaiverValueC1 = actionUtils.getInputValue(WebElementLibrary.LABEL_ANNUAL_FEE_WAIVER_CARD1, driver);
		String annualFeeWaiverValueC2 = actionUtils.getInputValue(WebElementLibrary.LABEL_ANNUAL_FEE_WAIVER_CARD2, driver);
		assertTrue(!annualFeeWaiverValueC1.isEmpty(), "Value for heading 'Annual Fee Waiver' is not populated for card 1");
		assertTrue(!annualFeeWaiverValueC2.isEmpty(), "Value for heading 'Annual Fee Waiver' is not populated for card 2");
		
		// Click Re-select button
		actionUtils.scrollByVisibleElement(WebElementLibrary.BTN_RESELECT, driver);
		actionUtils.clickJs(WebElementLibrary.BTN_RESELECT, driver);
		actionUtils.waitForPageLoadingJs(driver);
	}	
}
