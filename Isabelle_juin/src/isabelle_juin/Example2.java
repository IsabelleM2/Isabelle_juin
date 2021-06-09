
/* Author :Isabelle
 * Date   : June, 2,2021
 * Descripition: 
 */

package isabelle_juin;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Example2{
	
	public static void main(String[] args) throws IOException,FileNotFoundException
	{
		FileReader ficALire;
		BufferedReader entree;
		char c;
		
		ficALire=new FileReader("monFichier.txt");
		entree= new BufferedReader(ficALire);
		c=(char) entree.read();
		System.out.println(c);
		c=(char) entree.read();
		System.out.println(c);
		c=(char) entree.read();
		System.out.println(c);
		System.out.println(c);
		entree.close();
		ficALire.close();
}
	
	
	
}