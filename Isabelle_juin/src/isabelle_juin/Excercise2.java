/*
 * Author :Isabelle
 * Date   : June, 2,2021
 * Descripition: 
 */

package isabelle_juin;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Excercise2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader entree;
		int somme=0;
		entree = new BufferedReader(new FileReader("MonCalcul.txt"));
		
		while(entree.ready())
		{
			somme+=Integer.parseInt(entree.readLine());
			
		}
		entree.close();
		FileWriter FAL;
		PrintWriter sortie;
		FAL=new FileWriter("mon Resultat.txt");
		sortie=new PrintWriter(FAL);
		sortie.print(somme);
		sortie.close();

	}

}
