import java.util.Random;
public class Main {

	public static void main(String[] args) {
		
		int nbRounds = 0;
		Boolean victoire = false;
		
		
		Equipe equipeOrange = new Equipe("Orange");
		Equipe equipeBleue = new Equipe("Bleue");
		Armement M4 = new Armement("M4", 40);
		Armement MP5 = new Armement("MP5", 30);
		Armement Uzi = new Armement("Uzi", 25);
		Armement R4C = new Armement("R4C", 50);
		Armement Mp7 = new Armement("Mp7", 20);
		
		Operateurs Ash = new Operateurs ("Ash","Femme", "Opener", equipeOrange, R4C);
		Operateurs Sledge = new Operateurs ("Sledge","Homme", "Support Opener", equipeOrange, Uzi);
		Operateurs Thermite = new Operateurs ("Thermite","Homme", "Breacher", equipeOrange, M4);
		Operateurs Thatcher = new Operateurs ("Thatcher","Homme", "Support", equipeOrange, Uzi);
		Operateurs Zofia = new Operateurs ("Zofia","Femme", "Openeur", equipeOrange, M4);
		
		Operateurs Doc = new Operateurs ("Doc","Homme", "Support BP", equipeBleue, MP5);
		Operateurs Rook = new Operateurs ("Rook","Homme", "Support BP", equipeOrange, MP5);
		Operateurs Valkyrie = new Operateurs ("Valkyrie","Femme", "Cam", equipeOrange, R4C);
		Operateurs Bandit = new Operateurs ("Bandit","Homme", "Counter Breacher", equipeOrange, Mp7);
		Operateurs Jäger = new Operateurs ("Jäger","Homme", "Counter Nade", equipeOrange, M4);
		
		equipeOrange.addOperateurs(Ash);
		equipeOrange.addOperateurs(Sledge);
		equipeOrange.addOperateurs(Thermite);
		equipeOrange.addOperateurs(Thatcher);
		equipeOrange.addOperateurs(Zofia);
		
		equipeBleue.addOperateurs(Doc);
		equipeBleue.addOperateurs(Rook);
		equipeBleue.addOperateurs(Valkyrie);
		equipeBleue.addOperateurs(Bandit);
		equipeBleue.addOperateurs(Jäger);
		if( nbRounds == 0) {
			System.out.println(" La partie peut commencer ............" );
			System.out.println("Elle opposera l'équipe " + equipeOrange.getNomEquipe() + " à l'équipe " + equipeBleue.getNomEquipe());
			System.out.println("L'équipe bleue comporte les operateurs suivants : " + equipeBleue.getLesOpe());
			System.out.println("---------------------------------------------");
			System.out.println("L'équipe orange comporte les operateurs suivants : " + equipeOrange.getLesOpe());
			System.out.println(" Début du round 1 !" );
	
            
            while(victoire == false) {
            	Object[] opeAleatoireBleu = equipeBleue.getLesOperateurs().keySet().toArray();
                Object keyBlue = opeAleatoireBleu[new Random().nextInt(opeAleatoireBleu.length)];
                Operateurs opeBleu = equipeBleue.getLesOperateurs().get(keyBlue);
                Object[] opeAleatoireOrange = equipeOrange.getLesOperateurs().keySet().toArray();
                Object keyOrange = opeAleatoireOrange[new Random().nextInt(opeAleatoireOrange.length)];
                Operateurs opeOrange = equipeOrange.getLesOperateurs().get(keyOrange);
                System.out.println(opeBleu.PrendDommage(opeOrange.getNom(), opeOrange.getArme().getDegats()));
    			System.out.println(opeOrange.PrendDommage(opeBleu.getNom(), opeBleu.getArme().getDegats()));
            	if(opeBleu.getSante() >= 0 && opeOrange.getSante()>=0) {
            		System.out.println(opeBleu.PrendDommage(opeOrange.getNom(), opeOrange.getArme().getDegats()));
            		System.out.println(opeOrange.PrendDommage(opeBleu.getNom(), opeBleu.getArme().getDegats()));
            		if(equipeOrange.getNbJoueursEnVie() == 0 && opeOrange.getSante() <= 0) {
        				victoire = true;
        				System.out.println("L'équipe Bleue remporte la victoire");
        			}
        			if(equipeBleue.getNbJoueursEnVie() == 0 && opeBleu.getSante()<=0) {
        				victoire = true;
        				System.out.println("L'équipe Orange remporte la victoire");
        			}
            	}
            	
    			
    			nbRounds += 1;
    		}
    		
		}
		
		
		

	}

}
