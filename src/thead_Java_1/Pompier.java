/**
 * 
 */
package thead_Java_1;

/**
 * @author clement
 *
 */
public class Pompier {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Avec la Classe "Alerte extends Thread
		System.out.println("#####  Avec la Classe \"Alerte extends Thread  #####");
		Alerte test = new Alerte();
		Alerte test1 = new Alerte("test1");
		Alerte test2 = new Alerte("test2",Thread.MAX_PRIORITY);
		
		
		test.start();
		test1.start();
		test2.start();
		
		try {
			test.join();
			test1.join();
			test2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		System.out.println("#####  FIN  #####");
		System.out.println();
		System.out.println("#####  Avec la Classe \"Alerte implement Runnable  #####");
		
		AlerteR testR = new AlerteR();
		Thread threadtestR = new Thread(testR);
		
		AlerteR testR1 = new AlerteR("testR1");
		Thread threadtestR1 = new Thread(testR1);
		
		AlerteR testR2 = new AlerteR("testR2", 10);
		Thread threadtestR2 = new Thread(testR2);
		
		
		
		
		
		threadtestR.start();
		threadtestR1.start();
		threadtestR2.start();
		
		
		
	}

}
