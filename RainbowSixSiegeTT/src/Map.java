
public class Map {
	private String nomMap;
	private String meteo;
	
	public Map(String nomMap, String meteo) {
		this.nomMap = nomMap;
		this.meteo = meteo;
	}
	public String getNomMap() {
		return nomMap;
	}
	public String getMeteo() {
		return meteo;
	}
	@Override
	public String toString() {
		return "Cette classe en globe une Map " + nomMap + "en informant la météo" + meteo;
	}
	
}
