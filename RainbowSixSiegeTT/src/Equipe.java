import java.util.HashMap;
import java.util.Map;

public class Equipe {
	private String nomEquipe;
	private HashMap<String, Operateurs> lesOperateurs;
	private int nbJoueursEnVie;
	
	public Equipe(String nomEquipe) {
		this.nomEquipe = nomEquipe;
		this.lesOperateurs = new HashMap<String, Operateurs>();
		this.nbJoueursEnVie = 5;
	}
	
	public String getNomEquipe() {
		return nomEquipe;
	}
	public int getNbJoueursEnVie() {
		return nbJoueursEnVie;
	}
	public void setNbJoueursEnVie(int nbJoueursEnVie) {
		this.nbJoueursEnVie = nbJoueursEnVie;
	}
	
	public HashMap<String, Operateurs> getLesOperateurs() {
		return lesOperateurs;
	}
	public void setNomEquipe(String nomEquipe) {
		this.nomEquipe = nomEquipe;
	}
	
	
	public void addOperateurs(Operateurs operateur) {
		this.lesOperateurs.put(operateur.getNom(), operateur);
	}
	
	public String getLesOpe () {
		String nomOpe = "";
		for (String i : lesOperateurs.keySet()) {
			nomOpe += i + " ";
		}
		return nomOpe;
	}
}

