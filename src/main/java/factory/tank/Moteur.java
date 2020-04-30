package factory.tank;

/**
 * Décrivez votre classe Moteur ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Moteur
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    private int allume =  0;
    
    /**
     * Constructeur d'objets de classe Moteur
     */
    public Moteur()
    {
        // initialisation des variables d'instance
        this.allume = 0;
    }

    int allumerMoteur()
    {
        this.allume = 1;
        return this.allume;
    }
    
    int eteindreMoteur()
    {
        this.allume = 0;
        return this.allume;
    }
 
    String etatMoteur()
    {
        return "Le moteur est " + ( this.allume == 1 ? "allumé" : "éteint") ;
    }
    
}
