package thread_Java_exercice2;

public class rechercheThread extends Thread{
	
	tableauEntier tab;
	int debut;
	int fin;
	private int resultat;	
	
	public int getResultat() {
		return resultat;
	}

	public rechercheThread(tableauEntier tab, int debut,int fin) {
		// TODO Auto-generated constructor stub
		this.tab = tab;
		this.debut = debut;
		this.fin = fin;
	}
	
	public void run() {	
		resultat = tab.tableau[debut];		
		for (int i = debut+1; i<fin;i++){
			if ( resultat < tab.tableau[i] ) {
				resultat = tab.tableau[i];
			}
		}	
	}

}
