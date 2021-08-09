package ch08_2_2_polymorphism;

public class Example {

	public static void main(String[] args) {
		ImplementationC impl = new ImplementationC();
		
		InterfaceA ia = impl;
		ia.methodA();
		System.out.println();
		
		interfaceB ib = impl;
		ib.methodB();
		System.out.println();
		
		interfaceC ic= impl;
		ic.methodA();
		ic.methodB();
		ic.methodC();
		

	}

}
