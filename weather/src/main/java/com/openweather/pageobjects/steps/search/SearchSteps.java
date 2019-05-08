package com.openweather.pageobjects.steps.search;

import com.openweather.pageobjects.pages.search.SearchPage;
import net.thucydides.core.annotations.Step;

public class SearchSteps {

    SearchPage searchPage;

    @Step("Should see city label on search result.")
    public void should_see_city_link_label() {

        searchPage.shouldBeVisible(searchPage.lblLinkLondon);
    }
}
