package ch08_3_example;

interface NewPrintable{
	void print(String doc);
	default void printCMYK(String doc) {
		System.out.println("��������������������\n");
	}  //default�� ���̸� �Ϲݸ޼ҵ带 �������̽��ȿ��� �����Ҽ��ִ�.
}

class OldDriver implements NewPrintable {

	@Override
	public void print(String doc) {
		System.out.println("zzzzzz");
	
		
	}
	
}

class NewDriver implements NewPrintable{

	@Override
	public void print(String doc) {
		System.out.println("��");
		
		
	}
	@Override
	public void printCMYK(String doc) {
		System.out.println("����");
	}
}


public class PrinterTest4 {
	public static void main(String[] args) {
		
	
	
	String doc ="ļļļ";
	NewPrintable npt = new NewDriver();
	
	npt.print(doc);
	npt.printCMYK(doc);
	
	
}
}