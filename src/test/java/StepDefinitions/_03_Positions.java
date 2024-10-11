package StepDefinitions;

import Pages.LocatorPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class _03_Positions {

    LocatorPage lp = new LocatorPage();

    @And("The user clicks on the button at the bottom of the page")
    public void TheUserClicksOnTheButtonAtTheBottomOfThePage(DataTable dataTable) {
        List<String> items = dataTable.asList(String.class);
        for (int i = 0; i < items.size(); i++) {
            lp.scrollToBottomOfThePage();
            lp.myClick(lp.getWebElement(items.get(i)));
        }
    }

    @Given("The user selects {string} in the department filter")
    public void theUserSelectsInTheDepartmentFilter(String department, DataTable dataTable) {
        List<String> items = dataTable.asList(String.class);
        for (String s : items) {
            lp.mySendKeys(lp.getWebElement(s), department);
        }
        List<WebElement> birimler = lp.getBirimler();
        List<WebElement> birimlerCheckBox = lp.getBirimlerCheckBox();
        Assert.assertTrue(birimler.size() == birimlerCheckBox.size(), "birimler is not equal birimlerCheckBox");

        for (int i = 0; i < birimler.size(); i++) {
            if (birimler.get(i).getText().toLowerCase().trim().contains(department.toLowerCase().trim())) {
                lp.myJsClick(birimlerCheckBox.get(i));
            } else {
                System.out.println("There is no department containing the text " + department);
                break;
            }
        }
    }

    @When("The user enters {string} in the search box")
    public void TheUserEntersInTheSearchBox(String position, DataTable dataTable) {
        List<String> items = dataTable.asList(String.class);
        for (String s : items) {
            lp.mySendKeys(lp.getWebElement(s), position);
        }
    }

    @Then("the titles of the search results should contain {string}")
    public void theTitlesOfTheSearchResultsShouldContain(String position) {
        lp.waitUntilUrlChanged(position);
        List<WebElement> listOfPositions = lp.getGelenPozisyonlar();
        for (WebElement e : listOfPositions) {
            System.out.println("getText = " + e.getText().toLowerCase().trim());
            System.out.println(position.toLowerCase().trim());
            lp.verifyContainsText(e, position);
        }
    }

    @And("The user clicks on the first position in the search results {string}")
    public void TheUserClicksOnTheFirstPositionInTheSearchResults(String position) {
        lp.waitUntilUrlChanged(position);
        List<WebElement> inceleButonlari = lp.getInceleButonlari();
        if (inceleButonlari.size() == 0) {
            System.out.println("There is no positions containing the text " + position);
        } else {
            lp.myJsClick(inceleButonlari.get(0));
        }
    }

    @Then("the position page title should match {string}")
    public void thePositionPageTitleShouldMatch(String position, DataTable dataTable) {
        List<String> items = dataTable.asList(String.class);
        for (String s : items) {
            lp.verifyContainsText(lp.getWebElement(s), position);
        }
    }
}
