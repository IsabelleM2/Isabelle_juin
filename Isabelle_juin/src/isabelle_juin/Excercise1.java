/*
 * Author :Isabelle
 * Date   : June, 2,2021
 * Descripition: 
 */

package isabelle_juin;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Excercise1 {

	public static void main(String[] args) {
		FileReader FAL;
		BufferedReader entree;
		
		
		char c;
		int count=0;
		
		try {
			FAL =new FileReader ("/User/IsabelleMace/desktp/monfichier.txt");
			entree=new BufferedReader(FAL);
			
			while(entree.ready())
			{
				c= (char) entree.read();
				
				if(c=='a')
				{
					count ++;
				}
			}
			
		System.out.println("Il y a " + count+ "'a' dans ce texte");
		entree.close();

		}catch (FileNotFoundException fnf) {
			System.out.println("Le fichier ne peut pas etre lu");
			
		}catch(IOException ioe)
		{
			System.out.println("Erreur d'entree");
		}
	}

}
