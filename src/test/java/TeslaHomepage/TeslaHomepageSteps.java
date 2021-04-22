package TeslaHomepage;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TeslaHomepageSteps {

    public static WebDriver driver;

    @Before
    public void beforeScenario() {
        System.setProperty("webdriver.chrome.driver","./chromedriver");
        driver = new ChromeDriver();
        // Seems no more working in last Chrome versions
        // driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @Given("je suis sur la homepage {string}")
    public void je_suis_sur_la_homepage(String string) {
        driver.get(string);
    }

    @Then("le titre doit être {string}")
    public void le_titre_doit_être(String string) {
       assertEquals(string, driver.getTitle());
    }

    @Then("la description contient {string}")
    public void la_description_contient(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


    @Then("Il existe plusieurs {string}")
    public void il_existe_plusieurs(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("le menu de haut contient un lien {string} menant vers {string}")
    public void le_menu_de_haut_contient_un_lien_menant_vers(String string, String string2) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("le burger menu contient un lien {string}")
    public void le_burger_menu_contient_un_lien(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @After
    public void afterScenario() {
        driver.quit();
    }
}
