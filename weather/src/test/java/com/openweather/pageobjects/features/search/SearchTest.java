package com.openweather.pageobjects.features.search;

import com.openweather.pageobjects.steps.homepage.HomePageSteps;
import com.openweather.pageobjects.steps.search.SearchSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.*;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import static com.openweather.statics.Tag.*;
import static net.thucydides.core.annotations.ClearCookiesPolicy.BeforeEachTest;

@Narrative(text={"As a user",
        "I want to be able to check current weather of cities."})
@RunWith(SerenityRunner.class)
@WithTags({
        @WithTag(SEARCH),
})
public class SearchTest {

    @Managed(clearCookies=BeforeEachTest)
    WebDriver driver;

    @Steps
    HomePageSteps homePageSteps;

    @Steps
    SearchSteps searchSteps;

    @Before
    public void before(){
        homePageSteps.should_open_homepage();
    }

    @Test
    @Title("City Search on OpenWeatherMap")
    public void should_search_city_on_openweathermap() {

        homePageSteps.should_type_city_name_and_click_search_button("London, GB");
        searchSteps.should_see_city_link_label();
    }
}