package factory.tank;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

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
public class TankTest
{
    private Tank tank1;
    private Moteur moteur1;
    private Cible cible1;
    private Cible cible2;

    // Définissez ici les variables d'instance nécessaires à vos engagements;
    // Vous pouvez également les saisir automatiquement du présentoir
    // à l'aide du menu contextuel "Présentoir --> Engagements".
    // Notez cependant que ce dernier ne peut saisir les objets primitifs
    // du présentoir (les objets sans constructeur, comme int, float, etc.).



    /**
     * Constructeur de la classe-test Test.TankTest
     */
    public TankTest()
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
        moteur1 = new Moteur();
        cible1 = new Cible("Voiture");
        cible2 = new Cible("Maison");
        tank1.setMoteur(moteur1);
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
    public void testChargerObus()
    {
        Tank tank2 = new Tank();
        assertEquals(1, tank2.chargerObus());
        assertEquals(2, tank2.chargerObus());

    }

    @Test
    public void testRouler()
    {   
        //tank rouler allume le moteur. 
        assertEquals(1, tank1.rouler());
    }

    @Test
    public void testAddCible(){
        Cible cible3 = new Cible("Arbre");
        //
        tank1.addCible(cible1);
        tank1.addCible(cible2);
        //verfication ajout cible
        assertTrue(tank1.getCibles().contains(cible1));
        assertTrue(tank1.getCibles().contains(cible2));

        //verification de cible à tank
        assertTrue(cible1.getTank().equals(tank1));
        assertTrue(cible2.getTank().equals(tank1));

        //verfication non ajout
        assertFalse(tank1.getCibles().contains(cible3));
    }


}


