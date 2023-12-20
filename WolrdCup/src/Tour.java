import java.util.ArrayList;
import java.util.List;

public class Tour<T> {
    private String nom;
    private int nmbrEquipe;
    private List<Equipe> equipes;
    private List<Match> matchs;
    public List<Equipe> equipesVinqueurs;

    public Tour(String nom, int nmbrEquipe, List<Equipe> equipes) {
        this.nom = nom;
        this.nmbrEquipe = nmbrEquipe;
        this.equipes = new ArrayList<>(equipes.subList(0, nmbrEquipe));
        this.matchs = new ArrayList<>();
        this.equipesVinqueurs = new ArrayList<>();
        this.genererMatchs();
    }

    public void lister() {
        System.out.println("Tour " + nom + ":");
        for (Match match : matchs) {
            match.lister();
        }
    }

    public void updateResult(Match match) {
        matchs.stream()
                .filter(m -> m.equals(match))
                .findFirst()
                .ifPresent(m -> {
                    m.setResultats(match.getResultats());
                    determinerVinqueurs();
                });
    }

    public int nmrGoal(Equipe equipe) {
        int totalGoals = 0;
        for (Match match : matchs) {
            for (Equipe eq : match.getEquipes()) {
                if (eq.equals(equipe)) {
                    totalGoals += match.getResultats().get(eq);
                }
            }
        }
        return totalGoals;
    }

    private void genererMatchs() {
        for (int i = 0; i < nmbrEquipe / 2; i++) {
            Match match = new Match("Match " + (i + 1), equipes.subList(i * 2, i * 2 + 2));
            matchs.add(match);
        }
    }

    private void determinerVinqueurs() {
        equipesVinqueurs.clear();
        for (Match match : matchs) {
            for (Equipe equipe : match.getEquipes()) {
                if (match.getResultats().get(equipe) > match.getResultats().get(oppose(equipe, match.getEquipes()))) {
                    equipesVinqueurs.add(equipe);
                }
            }
        }
    }

    private Equipe oppose(Equipe equipe, List<Equipe> equipes) {
        return equipes.stream()
                .filter(e -> !e.equals(equipe))
                .findFirst()
                .orElse(null);
    }
}
