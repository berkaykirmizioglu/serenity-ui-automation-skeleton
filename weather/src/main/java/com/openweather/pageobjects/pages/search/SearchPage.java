package com.openweather.pageobjects.pages.search;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.CacheLookup;

public class SearchPage extends PageObject {

    @CacheLookup
    @FindBy(xpath = "//a[text()=' London, GB']")
    public WebElementFacade lblLinkLondon;
}
