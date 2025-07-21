package chapter17;

public class ThreadExtend extends Thread {
	
	public ThreadExtend() {
		super("스레드1"); // 부모 Thread 클래스의 생성자를 호출해서 스레드 이름 지정
	}
	
	@Override
	public void run() {
		// 1부터 10까지 1초 간격으로 출력
		for(int i = 0; i <= 10; i++) {
			try {

				sleep(1000); // 현재 스레드를 1초(1000ms) 멈춤 (Thread 클래스의 메서드)
				System.out.println(getName() + "---> " + i); // 스레드 이름과 숫자 출력
				
			} catch (Exception e){
				e.printStackTrace(); // 예외 발생 시 에러 내용 출력
			}
		}
	}
	
}
