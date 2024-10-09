package StepDefinitions;

import Pages.LocatorPage;
import Utilities.GWD;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;

import java.util.List;

public class _01_NavBar {

    LocatorPage lp = new LocatorPage();

    @Given("Navigate to website")
    public void navigateToWebsite() {
        GWD.getDriver().get("https://kariyer.baykartech.com/");
    }


    @Then("Language control")
    public void languageControl(DataTable dataTable) {
        List<List<String>> items = dataTable.asLists(String.class);
        String url = GWD.getDriver().getCurrentUrl();

        for (int i = 0; i < items.size(); i++){
            WebElement element=lp.getWebElement(items.get(i).get(0));
            String text = items.get(i).get(1);

            if (url.toLowerCase().contains(text.toLowerCase())){
                lp.myClick(element);
            }
        }
    }


    @When("When user clicks a navbar item, they are redirected correctly")
    public void whenUserClicksANavbarItemTheyAreRedirectedCorrectly(DataTable dataTable) {
        List<List<String>>   items=  dataTable.asLists(String.class);

        for (int i = 1; i < items.size(); i++) {
            WebElement element=lp.getWebElement(items.get(i).get(0));
            String text = items.get(i).get(1);

            if (i<=3)
                lp.myClick(lp.getWebElement(items.get(0).get(0)));

            lp.myClick(element);
            lp.verifyContainsTextInURL(text);
            lp.navigateBack();
        }
    }


}
