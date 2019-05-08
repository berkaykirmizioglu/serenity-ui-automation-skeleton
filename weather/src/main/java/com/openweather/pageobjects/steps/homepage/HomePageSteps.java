package com.openweather.pageobjects.steps.homepage;

import com.openweather.pageobjects.pages.homepage.HomePage;
import net.thucydides.core.annotations.Step;

public class HomePageSteps {

    HomePage homePage;

    @Step("Should see search result not found.")
    public void should_open_homepage() {

        homePage.open();
    }

    @Step("Should type '{0}' and click search button.")
    public void should_type_city_name_and_click_search_button(String cityName) {

        homePage.typeCityNameAndSearch(cityName);
    }
}
