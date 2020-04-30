package factory.tank;

/**
 * Décrivez votre classe Tank ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Tank
{

    private int nbObus = 0;
    private int nbObusMax = 10;
    
    private Moteur moteur;
    
    /**
     * Constructeur d'objets de classe Tank
     */
    public Tank()
    {
        // initialisation des variables d'instance
        this.nbObus = 0;
        this.nbObusMax = 10;
    }
    
    int getNbObus()
    {
        return this.nbObus;
    }
    
    int getNbObusMax()
    {
        return this.nbObusMax;
    }
    
    int chargerObus()
    {
        this.nbObus += (this.nbObus < nbObusMax ? 1 : 0); 
        return this.nbObus;
    }
    
   
    int rouler()
    {
        return moteur.allumerMoteur();
    }
    
    void setMoteur(Moteur moteur)
    {
        this.moteur = moteur;
    }
    
}
