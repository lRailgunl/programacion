package pru04.E01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collections;

public class PRU04E01_1_Guille_Diaz {

	public static void main(String[] args) {

		try {
			BufferedReader br=new BufferedReader(new FileReader("C:\\temp\\words.dat"));
			BufferedWriter bw=new BufferedWriter(new FileWriter("C:\\temp\\words_sort.dat"));
			String n1=System.getProperty("line.separator");
			String palabra;

			do {
				palabra=br.readLine();
			}

			while (palabra!=null);
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