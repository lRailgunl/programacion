package pru03.E04;

public class PRU03E04TempsTest_Guille_Diaz {

public static void main(String[] args) throws Exception {
		
		PRU03E04Temps_Guille_Diaz tiempo; 
		tiempo = new PRU03E04Temps_Guille_Diaz(5,20,30);		
		tiempo.SumaTemps(3, 55, 12);	
		tiempo.RestaTemps(6, 33, 48);
		//Imprimimos el toString
		System.out.println(tiempo.toString());		
	}
}