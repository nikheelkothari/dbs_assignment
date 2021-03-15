package com.auto.support;

public enum WebElementLibrary implements IDictionary {
	
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
