import enums.EnumPost;
import enums.EnumPosteArbitre;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Créer la Coupe du Monde
        WorldCup coupeDuMonde = new WorldCup("Qatar", 2022, 32);

        List<Player> joueursMaroc = Arrays.asList(
                new Player("Yassine", "Bounou", EnumPost.GARDIEN, 1, "FC Séville"),
                new Player("Abderrazak", "Hamdallah", EnumPost.ATTAQUANT, 9, "Ittihad Jeddah")
        );

        Equipe equipeMaroc = selectionnerEquipe(joueursMaroc);

        coupeDuMonde.ajouterEquipe(equipeMaroc);

        System.out.println("Nombre de buts marqués par l'équipe nationale du Maroc: " + coupeDuMonde.nmrGoal(equipeMaroc));

        System.out.println("Nombre de buts encaissés par l'équipe nationale du Maroc: " + coupeDuMonde.nmrGoalEncaisses(equipeMaroc));

        coupeDuMonde.faireChangement(1, 0, 2, 1); // Exemple de changement, à adapter selon les matchs réels

        System.out.println("Résultat après le changement dans le 2ème match du premier tour:");
        coupeDuMonde.tours[0].lister();

    }

    private static Equipe selectionnerEquipe(List<Player> joueurs) {

        return null;
    }
}
