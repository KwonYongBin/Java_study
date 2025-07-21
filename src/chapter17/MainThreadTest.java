package chapter17;

public class MainThreadTest {
	
	public static void main(String[] args) {
		// mainThread - main 메서드는 main 스레드에서 실행되며, 메인 스레드는 JVM이 시작되면서 자동으로 생성됨
		//1~10 정수 출력
		for(int i = 0; i <= 10; i++) {
			System.out.println(i);
		}
		
		// 사용자 정의 스레드 실행 (Thread 클래스를 상속받은 클래스 사용)
		ThreadExtend te = new ThreadExtend(); // te 스레드는 독립적으로 실행되며 main 스레드와 동시에 작동
		te.start(); // run() 메서드를 내부적으로 호출하여 스레드 실행
		
		
		// Runnable 인터페이스 구현체를 Thread에 전달하여 실행
		Thread t = new Thread(new RunnableImpl()); // t 스레드 역시 독립적으로 실행됨
		t.start();
		
		// 스레드는 순차적으로 실행되지 않고 OS 스케줄러에 의해 병렬적으로 실행되므로
		// 출력 결과는 뒤섞여 나올 수 있음 (예: main → Runnable → ThreadExtend → main ... 순서 랜덤)
		
		// main 스레드 종료 메시지
		System.out.println(" -- main thread 종료 -- ");
	}
}
