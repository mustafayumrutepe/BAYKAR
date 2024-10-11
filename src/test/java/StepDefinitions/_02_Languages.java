package StepDefinitions;

import Pages.LocatorPage;
import Utilities.GWD;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

public class _02_Languages {

    LocatorPage lp = new LocatorPage();
    ArrayList<String> listOfLanguages = new ArrayList<>();
    String textOfBody;
    ArrayList<String> listOfTextOfBody = new ArrayList<>();

    @When("The user checks the available languages")
    public void theUserChecksTheAvailableLanguages() {

        int numberOfLanguages = lp.getLanguages().size();

        for (int i = 0; i < numberOfLanguages; i++) {
            WebElement language = lp.getLanguages().get(i);
            String strLanguage = language.getAttribute("text");
            listOfLanguages.add(strLanguage);
        }
        System.out.println(listOfLanguages);
        System.out.println("There is " + numberOfLanguages + " languages.");
    }

    @Then("The available languages should include {string} and {string}")
    public void theAvailableLanguagesShouldIncludeAnd(String tr, String en) {
        Assert.assertTrue(listOfLanguages.get(0).toLowerCase().trim().equals(tr));
        Assert.assertTrue(listOfLanguages.get(1).toLowerCase().trim().equals(en));
    }


    @When("The user selects the language")
    public void theUserSelectsTheLanguage(DataTable dataTable) {
        List<List<String>> items = dataTable.asLists(String.class);
        String url = GWD.getDriver().getCurrentUrl();

        for (int i = 0; i < items.size(); i++) {
            WebElement element = lp.getWebElement(items.get(i).get(0));
            String text = items.get(i).get(1);

            if (url.toLowerCase().contains(text.toLowerCase())) {
                lp.myClick(element);
            }

        }
        textOfBody = lp.getWebElement(items.get(1).get(0)).getText();
        listOfTextOfBody.add(textOfBody);
    }

    @Then("The page URL should contains this")
    public void thePageURLShouldContainsThis(String string) {
        String url = GWD.getDriver().getCurrentUrl();
        lp.verifyContainsTextInURL(string);
    }

    @And("The main page elements should be correctly displayed in this language")
    public void theMainPageElementsShouldBeCorrectlyDisplayedInThisLanguage(DataTable dataTable) {
        List<List<String>> items = dataTable.asLists(String.class);
        for (int i = 0; i < items.size(); i++) {
            WebElement element = lp.getWebElement(items.get(i).get(0));
            String text = items.get(i).get(1);
            lp.verifyTextsAreEqual(element, text);
        }
    }

    @And("The last control Select all texts")
    public void theLastControlSelectAllTexts(String string) {
        Assert.assertFalse(listOfTextOfBody.get(0).equals(listOfTextOfBody.get(1)));
    }
}
