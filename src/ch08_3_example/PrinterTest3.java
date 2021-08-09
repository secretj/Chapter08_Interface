package ch08_3_example;

// 새로운(컬러) 프린터 등장~ 
class SP9600CDriver implements ColorPrintable{

	@Override
	public void printCMYK(String doc) {
		System.out.println("지녕이 칼라 프린터");
		System.out.println(doc + "\n");
		
	}

	@Override
	public void print(String doc) {
		System.out.println("지녕이 흑백 프린터");
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
