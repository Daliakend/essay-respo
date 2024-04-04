package thisone;
import java.util.ArrayList;
import java.util.List;



		public class Main {
		    public static void main(String[] args) {
		        // Création d'une bibliothèque
		        Bibliotheque bibliotheque = new Bibliotheque();

		        // Ajout de quelques livres
		        List<String> auteurs1 = new ArrayList<>();
		        auteurs1.add("Auteur1");
		        Livre livre1 = new Livre("B1090C20", "its end with us  ", auteurs1, "Fiction");
		        bibliotheque.ajouterLivre(livre1);

		        List<String> auteurs2 = new ArrayList<>();
		        auteurs2.add("Auteur2");
		        Livre livre2 = new Livre("B1090C21", "Rich Dad and poor dad", auteurs2, "Caricature");
		        bibliotheque.ajouterLivre(livre2);

		        // Création d'abonnés
		        Abonne abonne1 = new Abonne("Ahmed", "regulier");
		        Abonne abonne2 = new Abonne("Dalia", "vip");

		        // Emprunts de livres par les abonnés
		        abonne1.emprunterLivre(livre1);
		       abonne1.emprunterLivre(livre2);
		        abonne2.emprunterLivre(livre1);
		       abonne2.emprunterLivre(livre2); 

		        // Restitutions de livres par les abonnés
		        abonne1.restituerLivre(livre1);
		        abonne2.restituerLivre(livre2);  

		        // Affichage des informations sur la bibliothèque et les abonnés
		        System.out.println("Informations sur la bibliothèque :");
		        System.out.println(bibliotheque);

		        System.out.println("\nInformations sur les abonnés :");
		        System.out.println(abonne1);
		        System.out.println(abonne2);
		    }
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	


