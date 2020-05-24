package factory.tank;


import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * Décrivez votre classe military.factory.Tank ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Tank
{

    private static int nbTanks;
    private int id;
    private int nbObus = 0;
    private int nbObusMax = 10;
    
    private Moteur moteur;

    private Set<Cible> cibles;
    
    /**
     * Constructeur d'objets de classe military.factory.Tank
     */
    public Tank()
    {
        // initialisation des variables d'instance
        this.nbObus = 0;
        this.nbObusMax = 10;
        this.nbTanks++;
        this.id = nbTanks;
        cibles = new HashSet<>();
    }

    public Tank(Moteur moteur){
        this.nbObus = 0;
        this.nbObusMax = 10;
        this.nbTanks++;
        this.id = nbTanks;
        cibles = new HashSet<>();
        this.moteur = moteur;
    }
    
    int getNbObus()
    {
        return this.nbObus;
    }

    public int getNbObusMax()
    {
        return this.nbObusMax;
    }

    public int chargerObus()
    {
        this.nbObus += (this.nbObus < nbObusMax ? 1 : 0); 
        return this.nbObus;
    }


    public int rouler()
    {
        return moteur.allumerMoteur();
    }

    public void setMoteur(Moteur moteur)
    {
        this.moteur = moteur;
    }

    public boolean addCible(Cible cible){

        boolean res = this.cibles.add(cible);

        if(res) cible.setTank(this);

        return res;
    }

    public boolean destroyCible(Cible cible){
        return destroyCible(cible.getNom());
    }

    public boolean destroyCible(String nomCible){
        if(this.getNbObus()>0){
            for(Cible c : cibles){
                if(c.getNom().equals(nomCible)){
                    c.setTouche(true);
                    this.nbObus--;
                    return true;
                }
            }
        }
        return false;
    }

    public Set<Cible> getCibles() {
        return Collections.unmodifiableSet(cibles);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Tank)) return false;
        Tank tank = (Tank) o;
        return id == tank.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
