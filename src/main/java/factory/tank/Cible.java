package factory.tank;

import java.util.Objects;

public class Cible {
    private String nom;
    private Tank tank;
    private boolean touche;

    public Cible(String nom){
        this.nom = nom;
        this.touche = false;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setTank(Tank tank) {
        this.tank = tank;
        if(!tank.getCibles().contains(this)) tank.addCible(this);
    }

    public void setTouche(boolean touche) {
        this.touche = touche;
    }

    public String getNom() {
        return nom;
    }

    public Tank getTank() {
        return tank;
    }

    public boolean isTouche() {
        return touche;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cible cible = (Cible) o;
        return Objects.equals(nom, cible.nom);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nom);
    }

    @Override
    public String toString() {
        return "Cible{" +
                "nom='" + nom + '\'' +
                '}';
    }
}
