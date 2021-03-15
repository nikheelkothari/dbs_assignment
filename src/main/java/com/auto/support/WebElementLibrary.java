package com.auto.support;

public enum WebElementLibrary implements IDictionary {
	
//	BTN_BUY(new CssSelector("a.btn.buy")),
//	BTN_CHECK_OUT(new CssSelector("div.cart-checkout")),
//	BTN_CONTINUE(new CssSelector("div#application>div>a")),
//	LNK_CREDIT_CARD_PAYMENT(new CssSelector("div#payment-list>div:nth-child(2)")),
//	TXT_CREDIT_CARD_NMBR(new CssSelector("input[name='cardnumber']")),
//	LABEL_INPUT_CREDIT_CARD_ERROR_MSG(new CssSelector("div>label")),
//	LABEL_INVALID_CREDIT_CARD_ERROR_MSG(new CssSelector("div.notice.danger>div>span")),
//	TXT_CREDIT_CARD_EXPIRY_DATE(new CssSelector("input[placeholder='MM / YY']")),
//	TXT_CREDIT_CARD_CVV_NMBR(new CssSelector("input[placeholder='123']")),
//	BTN_PAY_NOW(new XPathSelector("//a[text() = 'Cards']")),
//	TXT_OTP(new CssSelector("input#PaRes")),
//	BTN_OK(new CssSelector("button.btn.btn-sm.btn-success")), 
//	LBL_TRANSACTION_SUCCESSFUL(new CssSelector("div.text-success.text-bold")),
//	LBL_TRANSACTION_FAILURE(new CssSelector("div.text-failed.text-bold"));
	
	LINK_CARDS(new XPathSelector("//div[@id='flpHeader']//a[text() = 'Cards']")),
	LINK_CREDIT_CARDS(new XPathSelector("//div/ul/li[2]//a[text() = 'Credit Cards']")),
	CHECK_1(new XPathSelector("//label[@for='cb0']/div/span")),
	CHECK_2(new XPathSelector("//label[@for='cb1']/div/span")),
	BTN_COMPARE_CARDS(new CssSelector("#cardCompareBtn")),
	BTN_RESELECT(new CssSelector("#cardReCompareBtn")),
	
	LABEL_BEST_FOR(new XPathSelector("//div[text() = 'Best For']")),
	LABEL_BEST_FOR_CARD1(new CssSelector("#card0>div:nth-child(6)>div:nth-child(2)")),
	LABEL_BEST_FOR_CARD2(new CssSelector("#card1>div:nth-child(6)>div:nth-child(2)")),
	
	LABEL_CARD_TYPE(new XPathSelector("//div[text() = 'Card Type']")),
	LABEL_CARD_TYPE_CARD1(new CssSelector("#card0>div:nth-child(6)>div:nth-child(4)")),
	LABEL_CARD_TYPE_CARD2(new CssSelector("#card1>div:nth-child(6)>div:nth-child(4)")),
	
	LABEL_MIN_INCOME(new XPathSelector("//div[text() = 'Min Income Per Annum']")),
	LABEL_MIN_INCOME_CARD1(new CssSelector("#card0>div:nth-child(6)>div:nth-child(6)")),
	LABEL_MIN_INCOME_CARD2(new CssSelector("#card1>div:nth-child(6)>div:nth-child(6)")),
	
	LABEL_MIN_INCOME_FOREIGNERS(new XPathSelector("//div[text() = 'Min Income Per Annum Foreigners']")),
	LABEL_MIN_INCOME_FOREIGNERS_CARD1(new CssSelector("#card0>div:nth-child(6)>div:nth-child(8)")),
	LABEL_MIN_INCOME_FOREIGNERS_CARD2(new CssSelector("#card1>div:nth-child(6)>div:nth-child(8)")),
	
	LABEL_ANNUAL_FEE_WAIVER(new XPathSelector("//div[text() = 'Annual Fee Waiver']")),
	LABEL_ANNUAL_FEE_WAIVER_CARD1(new CssSelector("#card0>div:nth-child(6)>div:nth-child(12)")),
	LABEL_ANNUAL_FEE_WAIVER_CARD2(new CssSelector("#card1>div:nth-child(6)>div:nth-child(12)"));
	
	private ISelector selector;
	
	private WebElementLibrary(ISelector selector) {
		this.selector = selector;
	}

	public String getSelectorDict() {
		return this.selector.getSelector();
	}

	public ISelector getSelectorTypeDict() {
		return this.selector;
	}
}
