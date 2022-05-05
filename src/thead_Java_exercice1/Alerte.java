/**
 * 
 */
package thead_Java_1;

/**
 * @author clement
 *
 */
public class Alerte extends Thread {
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
		for(int i = 0;i<5;i++) {
			System.out.println("Thead : "+getName()+", priorité : "+getPriority() + ", iteration : "+(i+1));
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	

}
