package ch08_1_interface;

public class MyClassExample {

	public static void main(String[] args) {
		System.out.println("1)-----------------");

		Myclass myClass1 = new Myclass();
		myClass1.rc.turnOn();
		myClass1.rc.setVolume(5);
	
	
		System.out.println("2)-----------------");
		
		Myclass myClass2 = new Myclass(new Audio());
		
		System.out.println("3)-----------------");
		
		Myclass myClass3 = new Myclass();
		myClass3.methodA();
		
		System.out.println("4)-----------------");
		
		Myclass myClass4 =new Myclass();
		myClass4.methodB(new Television("gg"));
		
	
	}
	
	

}
