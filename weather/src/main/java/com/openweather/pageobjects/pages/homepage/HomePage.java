package com.openweather.pageobjects.pages.homepage;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.support.CacheLookup;

@DefaultUrl("https://openweathermap.org/")
public class HomePage extends PageObject {

    @CacheLookup
    @FindBy(id = "nav-search")
    public WebElementFacade btnNavSearch;


    @CacheLookup
    @FindBy(id = "q")
    public WebElementFacade txtSearch;


    public void typeCityNameAndSearch(String cityName){

        btnNavSearch.click();
        txtSearch.click();
        txtSearch.typeAndEnter(cityName);
    }
}
