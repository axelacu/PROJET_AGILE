package factory.tank;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Before;

import java.lang.management.MonitorInfo;

import static org.junit.Assert.*;

public class US_04RunSteps {
    Cible cible;
    Tank tank = new Tank(new Moteur());
    boolean result;
    int stock;

    @Given("^Notre tank et une \"([^\"]*)\" tire avec un stock nul$")
    public void l_opérateur_refuse_le_tir_par_manque_de_munitions_et_false_mis_à_false(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        cible = new Cible(arg1);
        tank.addCible(cible);
    }

    @When("^L'état Major donne l'ordre de tir$")
    public void l_état_Major_donne_l_ordre_de_tir() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        stock = tank.getNbObus();
        result = tank.destroyCible(cible);
    }

    @Then("^L'opérateur refuse le tir par manque de munitions et false mis à false$")
    public void l_opérateur_refuse_le_tir_par_manque_de_munitions_et_false_mis_à_false() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        assertEquals("Erreur, tir à vide", false, result);
    }

    @Given("^Demande de destruction d'une \"([^\"]*)\"$")
    public void demande_de_destruction_d_une(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        cible = new Cible("charAllemand");
        tank.addCible(cible);
        tank.chargerObus();
    }

    @Then("^La cible doit être détruite et true mis à true$")
    public void la_cible_doit_être_détruite_et_true_mis_à_true() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        assertEquals("Erreur, obus non tiré", true, result );
    }

    @Given("^Notre tank tire avec un (\\d+) d'obus$")
    public void notre_tank_tire_avec_un_d_obus(int arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        cible = new Cible("charAllemand");
        tank.addCible(cible);
        for (int i = 1; i<=arg1; i++){
            tank.chargerObus();}
    }

    @Then("^Notre (\\d+) est calculé$")
    public void notre_est_calculé(int arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        assertEquals("Erreur, stock d'obus incorrect (non décrémenté après tir)", stock-1, tank.getNbObus());
    }

}
