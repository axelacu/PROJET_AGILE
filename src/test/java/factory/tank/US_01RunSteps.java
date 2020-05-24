package factory.tank;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Before;

import java.lang.management.MonitorInfo;

import static org.junit.Assert.*;

public class US_01RunSteps {

    Cible cible;
    Tank tank = new Tank(new Moteur());

    @Given("^L'ajout d'une cible comprend une \"([^\"]*)\"$")
    public void l_ajout_d_une_cible_comprend_une(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        cible = new Cible(arg1);
    }

    @When("^le soldat l'ajoute$")
    public void le_soldat_l_ajoute() throws Throwable {
        tank.addCible(cible);
    }

    @Then("^le nombre d'objet cible de (\\d+)$")
    public void le_nombre_d_objet_cible_de(int arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions

        assertEquals(tank.getCibles().size(),arg1);
    }

    //Scénario 2
    @Given("^L'ajout d'une cible comprend un \"([^\"]*)\"$")
    public void l_ajout_d_une_cible_comprend_un(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        cible = new Cible(arg1);
        tank.addCible(cible);
    }

    @When("^le soldat l'ajoute mais deja existante dans la liste$")
    public void le_soldat_l_ajoute_mais_deja_existante_dans_la_liste() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        tank.addCible(cible);
    }

    @Then("^le nombre est de (\\d+)$")
    public void le_nombre_est_de(int arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        assertFalse(tank.getCibles().size()>1);
    }
}
