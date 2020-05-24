package factory.tank;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.assertEquals;

public class US_02RunSteps {

    Tank tank ;
    int nombreFois;

    @Given("^le soldat veut incrementer le nombre d'obus (\\d+) fois$")
    public void le_soldat_veut_incrementer_le_nombre_d_obus_fois(int arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        nombreFois = arg1;
        tank = new Tank(new Moteur());
    }

    @When("^l'utilisateur chargeObus\\(\\)$")
    public void l_utilisateur_chargeObus() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        for(int i = 0; i<nombreFois ;i++){
            tank.chargerObus();
        }
    }

    @Then("^renvoi le nombre d'obus (\\d+) du tank$")
    public void renvoi_le_nombre_d_obus_du_tank(int arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        assertEquals(tank.getNbObus(),arg1);
    }

    @Given("^le soldat veut incrementer le nombre d'obus (\\d+)$")
    public void le_soldat_veut_incrementer_le_nombre_d_obus(int arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        nombreFois = arg1;
        tank = new Tank(new Moteur());
    }


    @Then("^renvoi le nombre d'obus capicité max du tank$")
    public void renvoi_le_nombre_d_obus_capicité_max_du_tank() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        assertEquals(tank.getNbObus(),tank.getNbObusMax());
    }
}
