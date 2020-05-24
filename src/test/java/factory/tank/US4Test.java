package factory.tank;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "./src/test/resources/US_04.feature"
)

public class US4Test {
    //test de non tir si le stock d'obus est nul
    @Test
    public void obusNul(){
        Tank tank = new Tank();
        Cible cible = new Cible("charAllemand");
        tank.addCible(cible);

        //stock = 0
        int stock = tank.getNbObus();

        //tir à vide car le stock d'obus est nul
        assertEquals("Erreur, tir à vide", tank.destroyCible(cible), false);

    }
    //test de tir si le stock d'obus est non nul
    @Test
    public void testTir(){
        Tank tank = new Tank();
        Cible cible = new Cible("charAllemand");
        tank.addCible(cible);

        //Stock d'obus vide donc on charge un obus
        tank.chargerObus();

        //stock = 1
        int stock = tank.getNbObus();

        //Obus non tiré alors que le stock est non vide
        assertEquals("Erreur, obus non tiré", tank.destroyCible(cible), true);
    }
    @Test
    public void testDecrement(){
        Tank tank = new Tank();
        Cible cible = new Cible("charAllemand");
        tank.addCible(cible);

        //Stock d'obus vide donc on charge un obus
        tank.chargerObus();

        //stock = 10
        int stock = tank.getNbObus();

        tank.destroyCible(cible);
        //Obus non tiré alors que le stock est non vide
        assertEquals("Erreur, stock d'obus incorrect (non décrémenté après tir)", tank.getNbObus(), stock-1);
    }
}
