package StepDefinitions;

import Pages.LocatorPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebElement;

import java.util.List;

public class _04_Login {

    LocatorPage lp = new LocatorPage();

    @When("The user enters valid email and password.")
    public void theUserEntersValidEmailAndPassword(DataTable dataTable) {
        List<List<String>> items = dataTable.asLists(String.class);
        for (int i = 0; i < items.size(); i++) {
            WebElement element = lp.getWebElement(items.get(i).get(0));
            String text = items.get(i).get(1);
            lp.mySendKeys(element, text);
        }
    }

    @And("The user clicks on the button")
    public void theUserClicksOnTheButton(DataTable dataTable) {
        List<String> items = dataTable.asList(String.class);
        for (int i = 0; i < items.size(); i++) {
            lp.myClick(lp.getWebElement(items.get(i)));
        }
    }

    @Then("The user should be successfully logged in.")
    public void theUserShouldBeSuccessfullyLoggedIn(DataTable dataTable) {
        List<List<String>> items = dataTable.asLists(String.class);
        for (int i = 0; i < items.size(); i++) {
            WebElement element = lp.getWebElement(items.get(i).get(0));
            String text = items.get(i).get(1);
            lp.verifyContainsText(element, text);
        }
    }
}
