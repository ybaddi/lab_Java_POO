import enums.EnumPosteArbitre;

import java.util.Objects;

public class Arbitre extends Personne{

    private EnumPosteArbitre poste;

    public Arbitre(String nom, String prenom, EnumPosteArbitre poste) {
        super(nom, prenom);
        this.poste = poste;
    }

    public EnumPosteArbitre getPoste() {
        return poste;
    }

    public void setPoste(EnumPosteArbitre poste) {
        this.poste = poste;
    }

    @Override
    public String toString() {
        return "Arbitre{" +
                "poste=" + poste +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Arbitre arbitre = (Arbitre) o;
        return poste == arbitre.poste;
    }

    @Override
    public int hashCode() {
        return Objects.hash(poste);
    }
}
