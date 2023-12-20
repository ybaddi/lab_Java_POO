import enums.EnumDiplome;

import java.util.Objects;

public class Coach extends Personne{
    private String nickName;
    private EnumDiplome diplome;

    public Coach(String nom, String prenom, String nickName, EnumDiplome diplome) {
        super(nom, prenom);
        this.nickName = nickName;
        this.diplome = diplome;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public EnumDiplome getDiplome() {
        return diplome;
    }

    public void setDiplome(EnumDiplome diplome) {
        this.diplome = diplome;
    }

    @Override
    public String toString() {
        return "Coach{" +
                "nickName='" + nickName + '\'' +
                ", diplome=" + diplome +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Coach coach = (Coach) o;
        return nickName.equals(coach.nickName) && diplome == coach.diplome;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nickName, diplome);
    }
}
