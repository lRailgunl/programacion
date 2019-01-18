package pru04.E02;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
public class PRU04E02_Guille_Diaz {
	
	
	private char letra;
	private boolean espacio;
	
	public String trocejarCamp(String cadena, int posicio_inicial, int posicio_final) {
		
		for (int i=0; i<cadena.length(); i++) {
			if (cadena.charAt(i)== ' ') {
				espacio=true;
			}
		}
		
		return null;
	}
	
	
	public static void main(String[] args) {

		try {
			PRU04E02_Guille_Diaz pru=new PRU04E02_Guille_Diaz();
			BufferedReader br=new BufferedReader(new FileReader("C:\\Temp\\dump_position_delimited.txt"));
			BufferedWriter bw=new BufferedWriter(new FileWriter("C:\\Temp\\"+args[0]+"sinespacios.dat"));
			
			String palabra="";
			palabra=br.readLine();
			while (palabra!=null) {
				
				pru.trocejarCamp(palabra, 1, 58);
				
			}
			
			
			br.close();
			bw.close();
		}

		catch (FileNotFoundException e) {
			System.out.println("No trobat");
		}
		catch (IOException e) {
			System.out.println("No es pot obrir");
		}
	}

}
