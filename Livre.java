package thisone;

import java.util.ArrayList;
import java.util.List;



	
	
	
	class Livre {
	    private String identifiant;
	    private String titre;
	    private List<String> auteurs;
	    private String categorie;
	    private List<Exemplairee> exemplaires;

	    public Livre(String identifiant, String titre, List<String> auteurs, String categorie) {
	        this.identifiant = identifiant;
	        this.titre = titre;
	        this.auteurs = auteurs;
	        this.categorie = categorie;
	        this.exemplaires = new ArrayList<>();
	    }

	    public String getIdentifiant() {
	        return identifiant;
	    }

	    public String getTitre() {
	        return titre;
	    }

	    public String getCategorie() {
	        return categorie;
	    }

	    public List<Exemplairee> getExemplaires() {
	        return exemplaires;
	    }

	    // M�thode pour ajouter un exemplaire
	    public void ajouterExemplaire(Exemplairee exemplaire) {
	        exemplaires.add(exemplaire);
	    }
	    
	    public boolean emprunter() {
	        for (Exemplairee exemplaire : exemplaires) {
	            if (exemplaire.isDisponible()) {
	                exemplaire.setDisponible(false);
	                return true; // Emprunt r�ussi
	            }
	        }
	        return false; // Aucun exemplaire disponible
	    }

	    // M�thode pour restituer un exemplaire du livre
	    public void restituer() {
	        for (Exemplairee exemplaire : exemplaires) {
	            if (!exemplaire.isDisponible()) {
	                exemplaire.setDisponible(true);
	                return; // Restitution r�ussie
	            }
	        }
	    }
 
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    

	    @Override
	    public String toString() {
	        return "Livre{" +
	                "identifiant='" + identifiant + '\'' +
	                ", titre='" + titre + '\'' +
	                ", auteurs=" + auteurs +
	                ", categorie='" + categorie + '\'' +
	                ", exemplaires=" + exemplaires +
	                '}';
	    }
	}


