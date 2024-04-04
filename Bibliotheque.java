package thisone;

import java.util.ArrayList;
import java.util.List;

public class Bibliotheque {
    private List<Livre> livres;

    public Bibliotheque() {
        this.livres = new ArrayList<>();
    }

    public void ajouterLivre(Livre livre) {
        livres.add(livre);
    }

    public List<Livre> rechercherLivres(String motCle) {
        List<Livre> resultats = new ArrayList<>();
        for (Livre livre : livres) {
            if (livre.getTitre().toLowerCase().contains(motCle.toLowerCase())) {
                resultats.add(livre);
            }
        }
        return resultats;
    }

    public List<Livre> rechercherLivresParCategorie(String categorie) {
        List<Livre> resultats = new ArrayList<>();
        for (Livre livre : livres) {
            if (livre.getCategorie().equalsIgnoreCase(categorie)) {
                resultats.add(livre);
            }
        }
        return resultats;
    }

    @Override
    public String toString() {
        return "Bibliotheque{" +
                "livres=" + livres +
                '}';
    }
}



/*import java.util.ArrayList;
import java.util.List;

public class Bibliotheque {

	  private List<Livre> livres;

	    public Bibliotheque() {
	        this.livres = new ArrayList<>();
	    }

	    public void ajouterLivre(Livre livre) {
	        livres.add(livre);
	    }

	    public List<Livre> rechercherLivres(String motCle) {
	        List<Livre> resultats = new ArrayList<>();
	        for (Livre livre : livres) {
	            if (livre.getTitre().toLowerCase().contains(motCle.toLowerCase()) ||
	                    livre.getCategorie().toLowerCase().contains(motCle.toLowerCase())) {
	                resultats.add(livre);
	            }
	        }
	        return resultats;
	    }

	}*/

	
	
