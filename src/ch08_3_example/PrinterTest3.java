package ch08_3_example;

// ���ο�(�÷�) ������ ����~ 
class SP9600CDriver implements ColorPrintable{

	@Override
	public void printCMYK(String doc) {
		System.out.println("������ Į�� ������");
		System.out.println(doc + "\n");
		
	}

	@Override
	public void print(String doc) {
		System.out.println("������ ��� ������");
		System.out.println(doc);
		
	}
	
}

public class PrinterTest3 {
	public static void main(String[] args) {
		
	
	String myDoc ="I LOVE U";
	ColorPrintable prn =new SP9600CDriver();
	
	prn.print(myDoc);
	prn.printCMYK(myDoc);
	
	}
	

}
