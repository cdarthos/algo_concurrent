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
		// TODO Auto-generated method stub
		Alerte test = new Alerte();
		test.start();
		try {
			test.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
