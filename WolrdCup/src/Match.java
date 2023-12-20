import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Match {
    private String nom;
    private Arbitre arbitre;
    private List<Equipe> equipes;
    private Map<Equipe, Integer> resultats;
    private Map<Equipe, Map<Player,Player>> changement;

    public Match(String nom, List<Equipe> equipes) {
        this.nom = nom;
        this.equipes = equipes;
        changement=new HashMap<Equipe,Map<Player,Player>>();
        changement.put(equipes.get(0),new HashMap<Player,Player>());
        changement.put(equipes.get(1),new HashMap<Player,Player>());
    }

    public List<Equipe> getEquipes() {
        return equipes;
    }

    public void setEquipes(List<Equipe> equipes) {
        this.equipes = equipes;
    }


    public Map<Equipe, Integer> getResultats() {
        return resultats;
    }

    public void setResultats(Map<Equipe, Integer> resultats) {
        this.resultats = resultats;
    }

    public void changerPlayer(Player player1, Player player2){
        if(equipes.get(0).getMainPlayers().contains(player2)){
            equipes.get(0).changerPlayer(player1, player2);
            changement.get(equipes.get(0)).put(player1,player2);
        }else{
            equipes.get(1).changerPlayer(player1, player2);
            changement.get(equipes.get(1)).put(player1,player2);
        }
    }


    public void lister() {
        String res =equipes.get(0).getNom() + " " + resultats.get(equipes.get(0)) + " \n" +
                equipes.get(1).getNom() + " " + resultats.get(equipes.get(1));
        System.out.println("Match{" +
                "nom='" + nom + '\'' +
                ", resultats=" + res +
                '}');
    }

    public void listerChangement() {
        for(Map.Entry<Equipe, Map<Player,Player>> change : changement.entrySet()){
            for (Map.Entry<Player,Player> item : change.getValue().entrySet()){
                System.out.println(item.getKey().getNom() + " ==>" + item.getValue().getNom());
            }
        }
    }
}
