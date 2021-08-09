package ch08_2_2_polymorphism;

public class Bus implements Vehicle{
	
	public void run() {
		System.out.println("버스달려");
	}
	
	public void checkFare() {
		System.out.println("승차요금을 계산합니다.");
	}

}
