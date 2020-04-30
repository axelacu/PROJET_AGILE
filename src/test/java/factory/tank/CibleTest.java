package factory.tank;

import static org.junit.Assert.*;


import factory.tank.Cible;
import factory.tank.Tank;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Classe-test Test.TankTest.
 *
 * @author  (votre nom)
 * @version (un numéro de version ou une date)
 *
 * Les classes-test sont documentées ici :
 * http://junit.sourceforge.net/javadoc/junit/framework/TestCase.html
 * et sont basées sur le document Š 2002 Robert A. Ballance intitulé
 * "JUnit: Unit Testing Framework".
 *
 * Les objets Test (et TestSuite) sont associés aux classes à tester
 * par la simple relation yyyTest (e.g. qu'un Test de la classe Name.java
 * se nommera NameTest.java); les deux se retrouvent dans le męme paquetage.
 * Les "engagements" (anglais : "fixture") forment un ensemble de conditions
 * qui sont vraies pour chaque méthode Test à exécuter.  Il peut y avoir
 * plus d'une méthode Test dans une classe Test; leur ensemble forme un
 * objet TestSuite.
 * BlueJ découvrira automatiquement (par introspection) les méthodes
 * Test de votre classe Test et générera la TestSuite conséquente.
 * Chaque appel d'une méthode Test sera précédé d'un appel de setUp(),
 * qui réalise les engagements, et suivi d'un appel à tearDown(), qui les
 * détruit.
 */
public class CibleTest {

    private Tank tank1;
    private Cible cible1;

    /**
     * Constructeur de la classe-test Test.TankTest
     */
    public CibleTest()
    {
    }

    /**
     * Met en place les engagements.
     *
     * Méthode appelée avant chaque appel de méthode de test.
     */
    @Before
    public void setUp() // throws java.lang.Exception
    {
        tank1 = new Tank();
        cible1 = new Cible("Voiture");
    }

    /**
     * Supprime les engagements
     *
     * Méthode appelée après chaque appel de méthode de test.
     */
    @After
    public void tearDown() // throws java.lang.Exception
    {
        //Libérez ici les ressources engagées par setUp()
    }

    @Test
    public void testSetCibleDe()
    {
        cible1.setTank(tank1);
        //verification de l'égalité
        assertEquals(tank1,cible1.getTank());
        assertTrue(tank1.getCibles().contains(cible1));
    }

    @Test
    public void testSetNom() {
        cible1.setNom("Avion");
        assertEquals(cible1.getNom(),"Avion");

    }

    @Test
    public void testSetTank() {
        cible1.setTank(tank1);
        Cible cible2 = new Cible("Avion");
        cible2.setTank(tank1);
        assertEquals(cible2.getTank(),cible1.getTank());
    }

    @Test
    public void testSetTouche() {
        cible1.setTouche(true);
        assertTrue(cible1.isTouche());
    }

    @Test
    public void testGetNom() {
        assertEquals(cible1.getNom(),"Voiture");
    }

    @Test
    public void testGetTank() {
        cible1.setTank(tank1);
        assertEquals(cible1.getTank(),tank1);
    }

    @Test
    public void testisTouche() {
        assertFalse(false);
    }

}
