import java.util.List;

public class Equipe {
    private String nom;

    private Coach coatch;
    private List<Player> mainPlayers;
    private List<Player> secondaryPlayers;

    public Equipe(String nom) {
        this.nom = nom;
    }

    public Equipe(String nom, List<Player> mainPlayers, List<Player> secondaryPlayers) {
        this.nom = nom;
        this.mainPlayers = mainPlayers;
        this.secondaryPlayers = secondaryPlayers;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public List<Player> getMainPlayers() {
        return mainPlayers;
    }

    public void setMainPlayers(List<Player> mainPlayers) {
        this.mainPlayers = mainPlayers;
    }

    public List<Player> getSecondaryPlayers() {
        return secondaryPlayers;
    }

    public void setSecondaryPlayers(List<Player> secondaryPlayers) {
        this.secondaryPlayers = secondaryPlayers;
    }

    public void Lister() {
        String mainPlayers="";
//        String secondaryPlayers="";
        for(Player item : this.mainPlayers){
            mainPlayers += "\n" +  item;
        }

//        for(Player item : this.secondaryPlayers){
//            secondaryPlayers += item;
//        }
        System.out.println("Equipe{" +
                "nom='" + nom + '\'' +
                ", mainPlayers=" + mainPlayers +
//                ", secondaryPlayers=" + secondaryPlayers +
                '}');
    }

    public void changerPlayer(Player player1, Player player2){
        if(secondaryPlayers.contains(player1) && mainPlayers.contains(player2)){
            secondaryPlayers.remove(player1);
                mainPlayers.remove(player2);
                mainPlayers.add(player1);
                secondaryPlayers.add(player2);
            System.out.println("changement done");
            } else{
            System.out.println("changement impossible");
        }
        }

}
