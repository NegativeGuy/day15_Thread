package day15_Thread;

class A01{
	public void run() {
		for(int i=0; i<100; i++) {
			System.out.println("A01 : "+i);
		}
	}
}
class B01{
	public void run() {
		for(int i=0; i<100; i++) {
			System.out.println("B01 : "+i);
		}
	}
}
public class Ex01 {
	public static void main(String[] args) {
		/*
		Thread(실)
		- 프로그램을 동작시키기 위한 최소한의 흐름 단위
		- 프로세스(process) 내에서 실제로 작업을 수행하는 주체
		- 프로그램이 1개의 Thread를 가지고 있다면,
		- 한가지 작업을 하고 다른 기능을 실행하려면 그 기능을 멈추거나
		- Thread를 추가하여야 한다. = (Multi Thread)
		*/
		A01 a = new A01();
		B01 b = new B01();
		a.run();	// a.run()이 실행을 마쳐야 b.run()이 실행
		b.run();	// 한번에 한가지 기능만 가능하기 때문에(thread가 1개일 때)
	}
}
