package factory.tank;

import cucumber.api.CucumberOptions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

public class US_03RunSteps {
    Tank tank ;
    int nombreFois;

    @Given("^le soldat desir faire avancer le tank$")
    public void le_soldat_desir_faire_avancer_le_tank() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        tank = new Tank(new Moteur());
    }

    @When("^le soldat allume le moteur$")
    public void le_soldat_allume_le_moteur() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        tank.rouler();
    }

    @Then("^renvoi l'(\\d+) du tank$")
    public void renvoi_l_du_tank(int arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        assertEquals(arg1,tank.rouler());
    }
}
