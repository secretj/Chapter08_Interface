package ch08_3_example;

public class PrinterTest1 {
	public static void main(String[] args) {
		
		String myDoc="This a report....";
		Printable prn = null;
		
		
		
		//�Ｚ ������ ��� �˻�
		prn =new SAMSUNG();
		prn.print(myDoc);
	
		
		
		//LG ������ ��� �˻�
		prn =new LG();
		prn.print(myDoc);
		
		
	}

}


// �Ｚ ������ ����̹�

class SAMSUNG implements Printable{

	@Override
	public void print(String doc) {
		System.out.println("�Ｚ ������");
		System.out.println(doc);
		
	}
	
	
}


class LG implements Printable{

	@Override
	public void print(String doc) {
		System.out.println("���� ����Ʈ");
		System.out.println(doc);
		
		
	}
	
}









//LG ������ ����̹�