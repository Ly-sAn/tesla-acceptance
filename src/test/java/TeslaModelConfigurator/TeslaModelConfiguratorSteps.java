package TeslaModelConfigurator;

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

public class TeslaModelConfiguratorSteps {

    public static WebDriver driver;

    @Before
    public void beforeScenario() {
        System.setProperty("webdriver.chrome.driver","./chromedriver");
        driver = new ChromeDriver();
        // Seems no more working in last Chrome versions
        // driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @Given("je suis sur la page {string}")
    public void je_suis_sur_la_page(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


    @Then("Par defaut prix LOA est {string}")
    public void par_defaut_prix_loa_est(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("A la selection du modele {string} prix LOA {string} carburant {string} montant total {string}")
    public void a_la_selection_du_modele_prix_loa_carburant_montant_total(String string, String string2, String string3, String string4) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("A la sélection option {string} prix augmente par mois {string}")
    public void a_la_sélection_option_prix_augmente_par_mois(String string, String string2) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("Apres config, click logo gauche et vérifier si popup gauche existe")
    public void apres_config_click_logo_gauche_et_vérifier_si_popup_gauche_existe() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("Dans popup selectionner {string}")
    public void dans_popup_selectionner(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("Le lien {string} contient url {string}")
    public void le_lien_contient_url(String string, String string2) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


    @After
    public void afterScenario() {
        driver.quit();
    }
}
