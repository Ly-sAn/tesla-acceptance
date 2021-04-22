package TeslaEvents;

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

public class TeslaEventsSteps {


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
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("Je clique sur le menu burger")
    public void je_clique_sur_le_menu_burger() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("Cliquer sur evenement menant vers {string}")
    public void cliquer_sur_evenement_menant_vers(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("Choisir un lieu dans le monde avec input")
    public void choisir_un_lieu_dans_le_monde_avec_input() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("La page contient une liste de {int} ou moins evenements")
    public void la_page_contient_une_liste_de_ou_moins_evenements(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("Un lien affiche tous les evenements")
    public void un_lien_affiche_tous_les_evenements() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("Un lien affiche plus d'evenements")
    public void un_lien_affiche_plus_d_evenements() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("Le formulaire Soyez informé contient les champs {string}")
    public void le_formulaire_soyez_informé_contient_les_champs(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("Remplir tous les champs du formulaire sauf email")
    public void remplir_tous_les_champs_du_formulaire_sauf_email() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("Appuyer du bouton du formulaire")
    public void appuyer_du_bouton_du_formulaire() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("Un message textuel {string} apparait")
    public void un_message_textuel_apparait(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("Chercher un evenement à {string}")
    public void chercher_un_evenement_à(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("Le premier résultat se trouve à {string}")
    public void le_premier_résultat_se_trouve_à(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("Chercher un evenement au {string}")
    public void chercher_un_evenement_au(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("Au click d'inscription, redirection vers url contenant {string}")
    public void au_click_d_inscription_redirection_vers_url_contenant(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @After
    public void afterScenario() {
        driver.quit();
    }
}
