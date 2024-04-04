package thisone;

public class Exemplairee {

	private String identifiant;
    private boolean disponible;

    public Exemplairee(String identifiant) {
        this.identifiant = identifiant;
        this.disponible = true;
    }

    public String getIdentifiant() {
        return identifiant;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    @Override
    public String toString() {
        return "Exemplaire{" +
                "identifiant='" + identifiant + '\'' +
                ", disponible=" + disponible +
                '}';
    }





	
	
	
	
	
	
	
	
	
	
}
