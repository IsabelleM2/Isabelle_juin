/* Author :Isabelle
 * Date   : June, 2,2021
 * Descripition: Introduction sur les expressions regulieres.
 * 				ETAPES / STRUCTURES
 */


package isabelle_juin;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExp1 {

	public static void main(String[] args) {
		Scanner crayon=new Scanner(System.in);
		
		//input est le texte dans lequel l'expression sera recherche
		System.out.println("Inscrire le text pour la recherche");
		String input =crayon.nextLine();
		//Expression a rechercher
		System.out.println("Inscrire le text recherche");
		String regEx =crayon.nextLine();
		
		//Etape 1: Utiliser Pattern
		Pattern pattern= Pattern.compile(regEx, Pattern.CASE_INSENSITIVE);
		
		//Etape 2: Allouer un objet Matcher pour l'entree specifie
		Matcher matcher=pattern.matcher(input);
		
		//Etape 3: verifier la concordance et afficher le resultat
		
		//========================================================
		
		// on peut utiliser find()
		/*while (matcher.find())
		{
			System.out.println("Le(s) mot(s) \"" +matcher.group()
			+"\" debute a l'indice" +matcher.start()
			+" et finit a l'indice" + matcher.end()
			
			
			);*/
		//}
		
		
		//===============================================
		//utiliser matches(); Doit correspondre entierement a tout le texte
		
		/*
		 * if (matcher.matches()) {
		 * System.out.println("Les deux textes sont les memes");
		 * 
		 * 
		 * }else { System.out.println("Les deux textes sont differents"); }
		 * 
		 */
		
		//====================================================
		//Utiliser lookingAt()
		
		if(matcher.lookingAt())
		{
			System.out.println("On a trouve \"" +
		matcher.group() + "\" commencant a l'indice" +matcher.start() +
		" et finit a l'indice " + matcher.end());
		}
		else {
			System.out.println("Le texte ne se trouve pas au debut");
		}
		}
		
	}
	


