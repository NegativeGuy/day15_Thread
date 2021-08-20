package day15_Thread;
class A02 extends Thread{ //Thread 상속
	public void run() {
		for(int i=0; i<100; i++) {
			System.out.println("A01 : "+i);
		}
	}
}
class B02 extends Thread{ //Thread 상속
	public void run() {
		for(int i=0; i<100; i++) {
			System.out.println("B01 : "+i);
		}
	}
}
public class Ex02 {
	public static void main(String[] args) {		
		A02 a = new A02();
		B02 b = new B02();
		
		a.setDaemon(true);
		b.setDaemon(true);
		// main이 종료되면 나머지 Tread들도 같이 종료 시킴
		
		a.start();	
		b.start(); 
		// start()는 Thread에 있는 매서드
		// start()를 호출하려면 반드시 run()매서드를 만들어줘야 한다
		// Tread를 상속 받기전에는 한번에 하나의 일만 가능했는데
		// 위에 처럼 각각 클래스에서 tread를 상속 받으면
		// 번갈아가며 실행한다
		// 현재 Tread는 총 3개이다(main 구동 Tread까지 포함해서)
		
		System.out.println("프로그램을 종료합니다");
		System.out.println("프로그램을 종료합니다");
		System.out.println("프로그램을 종료합니다");
	}
}
