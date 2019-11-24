
public class Operateurs {
	private int sante;
	private String nom, sexe, type;
	private Equipe equipe;
	private Armement arme;
	
	public Operateurs(String nom, String sexe, String type, Equipe equipe, Armement nomArme) {
		this.sante = 100;
		this.nom = nom;
		this.sexe = sexe;
		this.type = type;
		this.equipe = equipe;
		this.arme = nomArme;
	}
	
	
	public int getSante() {
		return sante;
	}
	public String getNom() {
		return nom;
	}
	public String getSexe() {
		return sexe;
	}
	public String getType() {
		return type;
	}
	public Equipe getEquipe() {
		return equipe;
	}
	public Armement getArme() {
		return arme;
	}
	
	public String PrendDommage(String nom, int degats) {
		String resultat = "";
		while(sante >0) {
			this.sante -= degats;
			
			if(sexe == "Femme"){
				resultat = this.nom + " s'est faite tirer dessus " + "par " + nom + " il lui reste maintenant " + sante + " points de vie";
				System.out.println(this.nom + " s'est faite tirer dessus " + "par " + nom + " il lui reste maintenant " + sante + " points de vie");
			}
			else{
				resultat = this.nom + " s'est fait tirer dessus " + "par " + nom + " il lui reste maintenant " + sante + " points de vie";
				System.out.println(this.nom + " s'est fait tirer dessus " + "par " + nom + " il lui reste maintenant " + sante + " points de vie");
			}	
			if(sante <= 0) {
				this.getEquipe().setNbJoueursEnVie(this.getEquipe().getNbJoueursEnVie() - 1);
				return this.nom + " est tombé au combat";
			}
		}
		return resultat;
	
		
	}
	public void addEquipe(Equipe equipe) {
		this.equipe = equipe;
	}


	@Override
	public String toString() {
		return "Operateurs [sante=" + sante + ", nom=" + nom + ", sexe=" + sexe + ", type=" + type + "]";
	}
}


