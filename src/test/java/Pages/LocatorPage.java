package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.List;

public class LocatorPage extends Parent{
    public LocatorPage() {PageFactory.initElements(GWD.getDriver(),this);}

    @FindBy(xpath = "/html/body")                                  private WebElement body;
    @FindBy(xpath = "(//*[@class='offcanvas-button']/li)[2]")      private WebElement language;
    @FindBy(xpath = "(//*[@class='navbar-nav']/li)[1]/a")          private WebElement kariyer;
    @FindBy(xpath = "(//*[@class='navbar-nav']/li/ul/li)[1]")      private WebElement irtifa;
    @FindBy(xpath = "(//*[@class='navbar-nav']/li/ul/li)[2]")      private WebElement yerleskelerimiz;
    @FindBy(xpath = "(//*[@class='navbar-nav']/li/ul/li)[3]")      private WebElement yasam;
    @FindBy(xpath = "(//*[@class='navbar-nav']/li)[3]")            private WebElement pozisyonlar;
    @FindBy(xpath = "(//*[@class='navbar-nav']/li)[5]/a")          private WebElement staj;
    @FindBy(xpath = "(//*[@class='navbar-nav']/li)[7]")            private WebElement sss;
    @FindBy(xpath = "(//*[@class='navbar-nav']/li)[9]")            private WebElement baykar;
    @FindBy(xpath = "//*[@class='top-btn']")                       private WebElement giris;
    @FindBy(css = "[name='login']")                                private WebElement email;
    @FindBy(id = "id_password")                                    private WebElement password;
    @FindBy(xpath = "//div[@class='g-recaptcha']")                 private WebElement recaptcha;
    @FindBy(css = "[type='submit']")                               private WebElement login;
    @FindBy(id = "swal2-title")                                    private WebElement loginVerify;
    @FindBy(xpath = "//a[contains(text(),'Açık Pozisyonlar')]")    private WebElement acikPozisyonlarBottom;
    @FindBy(xpath = "")                                            private WebElement position;
    @FindBy(xpath = "//div[@class='internContentLeft']//h4")       private WebElement positionPageTitle;
    @FindBy(id = "search")                                         private WebElement searchBox;
    @FindBy(id = "searchInput")                                    private WebElement birimAra;

    public WebElement getWebElement(String strElement){
        switch (strElement){
            case "body":                    return this.body;
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
            case "email":                   return this.email;
            case "password":                return this.password;
            case "recaptcha":               return this.recaptcha;
            case "login":                   return this.login;
            case "loginVerify":             return this.loginVerify;
            case "acikPozisyonlarBottom":   return this.acikPozisyonlarBottom;
            case "position":                return this.position;
            case "positionPageTitle":       return this.positionPageTitle;
            case "searchBox":               return this.searchBox;
            case "birimAra":                return this.birimAra;
        }
        return null;
    }






    @FindBy(xpath = "(//*[@class='offcanvas-button']/li)[2]/ul/li/a")                     private List<WebElement> languages;
    @FindBy(xpath = "(//div[@id='filterSearch']/following-sibling::ul)//li")              private List<WebElement> birimler;
    @FindBy(xpath = "(//div[@id='filterSearch']/following-sibling::ul)//li//div//input")  private List<WebElement> birimlerCheckBox;
    @FindBy(xpath = "//div[@class='workBox']//h3")                                        private List<WebElement> gelenPozisyonlar;
    @FindBy(xpath = "//div[@class='buton-content']//a")                                   private List<WebElement> inceleButonlari;

    public List<WebElement> getLanguages()                    {return languages;}
    public List<WebElement> getBirimler()                     {return birimler;}
    public List<WebElement> getBirimlerCheckBox()             {return birimlerCheckBox;}
    public List<WebElement> getGelenPozisyonlar()             {return gelenPozisyonlar;}
    public List<WebElement> getInceleButonlari()              {return inceleButonlari;}


}
