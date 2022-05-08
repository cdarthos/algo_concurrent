package thread_Java_exercice2;

public class recherche {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int taille = 100000000;
		tableauEntier tableau = new tableauEntier(taille);
		//tableau.afficher();
		
		
		//Recherche sequentielle
		long debut = System.currentTimeMillis();		 
		int resultat1Thread = recherchePlusGrand(tableau, 0, taille);	 
		long oneThread = System.currentTimeMillis()-debut;
		
		//Recherche avec 2 threads		
		long debutThread = System.currentTimeMillis();
		rechercheThread rechThread1 = new rechercheThread(tableau, 0, taille/2);
		rechercheThread rechThread2 = new rechercheThread(tableau, taille/2 + 1, taille);
		rechThread1.start();
		rechThread2.start();
		try {
			rechThread1.join();
			rechThread2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int resultatPartiel1 = rechThread1.getResultat();
		int resultatPartiel2 = rechThread2.getResultat();		
		int resultat2Thread = (resultatPartiel1 < resultatPartiel2)?resultatPartiel2:resultatPartiel1;			
		long twoThread = System.currentTimeMillis()-debutThread;
		
		//Recherche avec 3 threads		
		long debut3Thread = System.currentTimeMillis();
		rechercheThread rech2Thread1 = new rechercheThread(tableau, 0, taille/3);
		rechercheThread rech2Thread2 = new rechercheThread(tableau, taille/3 + 1, taille*2/3);
		rechercheThread rech2Thread3 = new rechercheThread(tableau, taille*2/3 + 1, taille);
		rech2Thread1.start();
		rech2Thread2.start();
		rech2Thread3.start();
		try {
			rech2Thread1.join();
			rech2Thread2.join();
			rech2Thread3.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int resultat2Partiel1 = rech2Thread1.getResultat();
		int resultat2Partiel2 = rech2Thread2.getResultat();	
		int resultat2Partiel3 = rech2Thread3.getResultat();
		int resultat3Thread = (resultat2Partiel1 < resultat2Partiel2)?resultat2Partiel2:resultat2Partiel1;	
		resultat3Thread = (resultat3Thread < resultat2Partiel2)?resultat2Partiel3:resultat3Thread;	
		
		long threeThread = System.currentTimeMillis()-debut3Thread;
		
		System.out.println("Recherche 1 Thread a trouvé : "+resultat1Thread+" en : "+ oneThread+"ms");
		System.out.println("Recherche 2 Thread a trouvé : "+resultat2Thread+" en : "+ twoThread+"ms");
		System.out.println("Recherche 3 Thread a trouvé : "+resultat3Thread+" en : "+ threeThread+"ms");
	}
	
	public static int recherchePlusGrand(tableauEntier tab, int debut,int fin) {
		int currentMax = tab.tableau[debut];
		
		for (int i = debut+1; i<fin;i++){
			if ( currentMax < tab.tableau[i] ) {
				currentMax = tab.tableau[i];
			}
		}
		
		return currentMax;
		
	}

}
