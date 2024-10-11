package Pages;

import Utilities.GWD;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class Parent {

    public WebDriverWait wait = new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(20));

    public void myClick(WebElement element) {
        wait.until(ExpectedConditions.elementToBeClickable(element));
        scrollToElement(element);
        element.click();
    }

    public void mySendKeys(WebElement element, String yazi) {
        wait.until(ExpectedConditions.visibilityOf(element));
        scrollToElement(element);
        element.clear();
        element.sendKeys(yazi);
    }

    public void scrollToElement(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) GWD.getDriver();
        js.executeScript("arguments[0].scrollIntoView();", element);
    }

    public void scrollToBottomOfThePage() {
        WebElement element = GWD.getDriver().findElement(By.xpath("//*[last()]"));
        element.sendKeys(Keys.END);
    }

    public void verifyContainsText(WebElement element, String value) {
        wait.until(ExpectedConditions.visibilityOfAllElements(element));
        Assert.assertTrue(element.getText().toLowerCase().contains(value.toLowerCase()),
                "The searched value is not included in the text of the WebElement");
        new Actions(GWD.getDriver()).sendKeys(Keys.ESCAPE).build().perform();
    }

    public void verifyTextsAreEqual(WebElement element, String value) {
        wait.until(ExpectedConditions.visibilityOf(element));
        Assert.assertEquals(element.getAttribute("text").trim().toLowerCase(), value.trim().toLowerCase());
        //action la ESC ye basarak açık kutucuk veya mesaj var ise kapat
        new Actions(GWD.getDriver()).sendKeys(Keys.ESCAPE).build().perform();
    }

    public void myJsClick(WebElement element) {
        wait.until(ExpectedConditions.elementToBeClickable(element));
        scrollToElement(element);
        JavascriptExecutor js = (JavascriptExecutor) GWD.getDriver();
        js.executeScript("arguments[0].click();", element);
    }


    public void verifyContainsTextInURL(String value) {
        wait.until(ExpectedConditions.urlContains(value));
        String currentURL = GWD.getDriver().getCurrentUrl().toLowerCase();
        Assert.assertTrue(currentURL.contains(value.toLowerCase()), "URL " + value + " metnini içermiyor!");
        new Actions(GWD.getDriver()).sendKeys(Keys.ESCAPE).build().perform();
    }


    public void navigateBack() {
        wait.until(ExpectedConditions.jsReturnsValue("return document.readyState==\"complete\";"));
        GWD.getDriver().navigate().back();
    }

    public void waitUntilUrlChanged(String text) {
        String firstWord = text.split(" ")[0];
        wait.until(ExpectedConditions.urlContains(firstWord));
    }

}
