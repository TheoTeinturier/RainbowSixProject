
public class Armement {
	private String nomArme;
	private int degats;
	
	public Armement( String nomArme, int degats) {
		this.nomArme = nomArme;
		this.degats = degats;
	}
	public String getNomArme() {
		return nomArme;
	}
	public int getDegats() {
		return degats;
	}
	
	
	
	
	@Override
	public String toString() {
		return "Armement [nomArme=" + nomArme + ", degats=" + degats
				+ "]";
	}
}
