/**
 * 
 */
package thead_Java_exercice1;

/**
 * @author clement
 *
 */
public class Alerte extends Thread {
	
	static int nbAlerte = 0;
	
	public Alerte() {		
	}
	public Alerte(String name) {
		setName(name);
	}
	public Alerte(String name, int priority) {
		setName(name);
		setPriority(priority);
	}
	
	
	public void run() {		
		nbAlerte++;		
		for(int i = 0;i<5;i++) {
			System.out.println("Il y a : "+nbAlerte+" alertes, Thead : "+getName()+", priorité : "+getPriority() + ", iteration : "+(i+1));
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	

}
