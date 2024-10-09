package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LocatorPage extends Parent{
    public LocatorPage() {PageFactory.initElements(GWD.getDriver(),this);}

    @FindBy(xpath = "(//*[@class='offcanvas-button']/li)[2]")          public WebElement language;
    @FindBy(xpath = "(//*[@class='navbar-nav']/li)[1]")                public WebElement kariyer;
    @FindBy(xpath = "(//*[@class='navbar-nav']/li/ul/li)[1]")          public WebElement irtifa;
    @FindBy(xpath = "(//*[@class='navbar-nav']/li/ul/li)[2]")          public WebElement yerleskelerimiz;
    @FindBy(xpath = "(//*[@class='navbar-nav']/li/ul/li)[3]")          public WebElement yasam;
    @FindBy(xpath = "(//*[@class='navbar-nav']/li)[3]")                public WebElement pozisyonlar;
    @FindBy(xpath = "(//*[@class='navbar-nav']/li)[5]")                public WebElement staj;
    @FindBy(xpath = "(//*[@class='navbar-nav']/li)[7]")                public WebElement sss;
    @FindBy(xpath = "(//*[@class='navbar-nav']/li)[9]")                public WebElement baykar;
    @FindBy(xpath = "//*[@class='top-btn']")                           public WebElement giris;


    public WebElement getWebElement(String strElement){
        switch (strElement){
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


}
