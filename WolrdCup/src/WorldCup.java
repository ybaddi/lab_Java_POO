import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WorldCup {
    private String nomCountry;
    private int annee;
    private String slug;
    private int nmbrEquipe;
    public Tour[] tours;
    private Equipe[] equipesChampionnes;

    public WorldCup(String nomCountry, int annee, int nmbrEquipe) {
        this.nomCountry = nomCountry;
        this.annee = annee;
        this.slug = nomCountry.substring(0, 1).toUpperCase() + nomCountry.substring(1) + annee;
        this.nmbrEquipe = nmbrEquipe;
        this.tours = new Tour[7];
        this.equipesChampionnes = new Equipe[3];
        this.genererTours();
    }

    public int nmrGoal(Equipe equipe) {
        int totalGoals = 0;
        for (Tour tour : tours) {
            totalGoals += tour.nmrGoal(equipe);
        }
        return totalGoals;
    }



    private void genererTours() {
        int nmbrEquipeTour = nmbrEquipe;

        for (int i = 0; i < 7; i++) {
            // Créer une liste d'équipes pour le tour
            List<Equipe> equipesTour = new ArrayList<>(Arrays.asList(new Equipe[nmbrEquipeTour]));

            // Remplir la liste avec les équipes gagnantes du tour précédent
            if (i > 0) {
                equipesTour.addAll(tours[i - 1].equipesVinqueurs);
            }

            // Créer le tour
            tours[i] = new Tour("Tour " + (i + 1), nmbrEquipeTour, equipesTour);

            // Réduire le nombre d'équipes pour le prochain tour
            nmbrEquipeTour /= 2;
        }
    }

    private void genererTours_1() {
        for (int i = 0; i < 7; i++) {
            int nmbrEquipeTour = (int) Math.pow(2, 7 - i);
            tours[i] = new Tour("Tour " + (i + 1), nmbrEquipeTour, genererEquipes());
        }
        determinerChampionnes();
    }

    private List<Equipe> genererEquipes() {
        // Génération de la liste d'équipes pour le tour, par exemple, en utilisant un algorithme aléatoire
        List<Equipe> equipes = new ArrayList<>();
        for (int i = 0; i < nmbrEquipe; i++) {
            equipes.add(new Equipe("Equipe " + (i + 1)));
        }
        return equipes;
    }

    private void determinerChampionnes() {
        for (int i = 0; i < 3; i++) {
            equipesChampionnes[i] = (Equipe)tours[6].equipesVinqueurs.get(i);
        }
    }

    public void faireChangement(int i, int i1, int i2, int i3) {
    }

    public void ajouterEquipe(Equipe equipeMaroc) {

    }

    public String nmrGoalEncaisses(Equipe equipeMaroc) {
        return null;
    }
}
