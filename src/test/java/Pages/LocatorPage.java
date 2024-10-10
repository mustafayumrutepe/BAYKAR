package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class LocatorPage extends Parent{
    public LocatorPage() {PageFactory.initElements(GWD.getDriver(),this);}

    @FindBy(xpath = "/html/body")          private WebElement body;
    @FindBy(xpath = "(//*[@class='offcanvas-button']/li)[2]")          private WebElement language;
    @FindBy(xpath = "(//*[@class='navbar-nav']/li)[1]/a")                private WebElement kariyer;
    @FindBy(xpath = "(//*[@class='navbar-nav']/li/ul/li)[1]")          private WebElement irtifa;
    @FindBy(xpath = "(//*[@class='navbar-nav']/li/ul/li)[2]")          private WebElement yerleskelerimiz;
    @FindBy(xpath = "(//*[@class='navbar-nav']/li/ul/li)[3]")          private WebElement yasam;
    @FindBy(xpath = "(//*[@class='navbar-nav']/li)[3]")                private WebElement pozisyonlar;
    @FindBy(xpath = "(//*[@class='navbar-nav']/li)[5]/a")                private WebElement staj;
    @FindBy(xpath = "(//*[@class='navbar-nav']/li)[7]")                private WebElement sss;
    @FindBy(xpath = "(//*[@class='navbar-nav']/li)[9]")                private WebElement baykar;
    @FindBy(xpath = "//*[@class='top-btn']")                           private WebElement giris;


    public WebElement getWebElement(String strElement){
        switch (strElement){
            case "body":                return this.body;
            case "language":                return this.language;
            case "kariyer":                 return this.kariyer;
            case "irtifa":                  return this.irtifa;
            case "yerleskelerimiz":         return this.yerleskelerimiz;
            case "yasam":                   return this.yasam;
            case "pozisyonlar":             return this.pozisyonlar;
            case "staj":                    return this.staj;
            case "sss":                     return this.sss;
            case "baykar":                  return this.baykar;
            case "giris":                   return this.giris;
        }
        return null;
    }




    @FindBy(xpath = "(//*[@class='offcanvas-button']/li)[2]/ul/li/a")       private List<WebElement> languages;


    public List<WebElement> getLanguages()                                 {return languages;}





}
