package thread_Java_exercice2;

import java.util.Random;

public class tableauEntier {
	int[] tableau;
	int taille;
	
	public tableauEntier(int taille) {
		// TODO Auto-generated constructor stub
		this.taille = taille;
		tableau = new int[taille];
		
		Random r = new Random();

		
		for(int i=0; i<taille; i++)  
		{     
		tableau[i]=r.nextInt(1000000); 
		} 
	}
	public void afficher() {

		for(int i = taille - 1;i>=0;i--) {
			System.out.println(tableau[i]);
		}
	}
}
