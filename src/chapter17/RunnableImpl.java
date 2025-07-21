package chapter17;

public class RunnableImpl implements Runnable {
	public RunnableImpl() {}
	
	@Override
	public void run() {
		//1~10 출력
		for (int i = 0; i <= 10; i++) {
			try {
				
				Thread.sleep(1000);
				System.out.println("Runnable ---> " + i);
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
