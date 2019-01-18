package pru04.E01;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class PRU04E01_1_Guille_Diaz {

	public static void main(String[] args) {

		try {
			BufferedReader br=new BufferedReader(new FileReader("C:\\Temp\\"+args[0]+".dat"));
			BufferedWriter bw=new BufferedWriter(new FileWriter("C:\\Temp\\"+args[0]+"sort.dat"));
			String n1=System.getProperty("line.separator");
			String palabra="";
			ArrayList<String> palabras=new ArrayList<String>();

			do {
				palabra=br.readLine();
				if (palabra!=null) {
					palabras.add(palabra);
					System.out.println(palabra);
				}
			}
			while (palabra!=null);
			Collections.sort(palabras);
			for (int i=0;i<palabras.size();i++) {
				bw.write(palabras.get(i)+n1);
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