package thead_Java_1;

public class AlerteR implements Runnable{

	public AlerteR() {
		
	}
	public AlerteR(String name) {
		Thread.currentThread().setName(name);
	}
	public AlerteR(String name, int priority) {
		Thread.currentThread().setName(name);
		Thread.currentThread().setPriority(priority);
	}
	
	


	public void run() {
		for(int i = 0;i<5;i++) {
			System.out.println("Thead : "+Thread.currentThread().getName()+", priorité : "+Thread.currentThread().getPriority() + ", iteration : "+(i+1));
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
