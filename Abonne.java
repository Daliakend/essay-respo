package thisone;

import java.util.ArrayList;
import java.util.List;

public class Abonne {
    private String nom;
    private String plan; // "regulier" ou "vip"
    private List<Livre> livresEmpruntes;

    public Abonne(String nom, String plan) {
        this.nom = nom;
        this.plan = plan;
        this.livresEmpruntes = new ArrayList<>();
    }

    public String getNom() {
        return nom;
    }

    public String getPlan() {
        return plan;
    }

    public List<Livre> getLivresEmpruntes() {
        return livresEmpruntes;
    }

    // Méthode pour emprunter un livre
    public void emprunterLivre(Livre livre) {
        if (livresEmpruntes.size() < (plan.equals("vip") ? 5 : 2)) {
            if (livre.emprunter()) {
                livresEmpruntes.add(livre);
                System.out.println("Livre emprunté avec succès : " + livre.getTitre());
            } else {
                System.out.println("Le livre n'est pas disponible pour l'emprunt : " + livre.getTitre());
            }
        } else {
            System.out.println("Limite d'emprunt atteinte pour cet abonné.");
        }
    }

    // Méthode pour restituer un livre
    public void restituerLivre(Livre livre) {
        if (livresEmpruntes.contains(livre)) {
            livre.restituer();
            livresEmpruntes.remove(livre);
            System.out.println("Livre restitué avec succès : " + livre.getTitre());
        } else {
            System.out.println("Cet abonné n'a pas emprunté ce livre.");
        }
    }

    @Override
    public String toString() {
        return "Abonne{" +
                "nom='" + nom + '\'' +
                ", plan='" + plan + '\'' +
                ", livresEmpruntes=" + livresEmpruntes +
                '}';
    }
}
