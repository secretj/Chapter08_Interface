package ch08_3_example;

public class PrinterTest1 {
	public static void main(String[] args) {
		
		String myDoc="This a report....";
		Printable prn = null;
		
		
		
		//삼성 프린터 출력 검사
		prn =new SAMSUNG();
		prn.print(myDoc);
	
		
		
		//LG 프린터 출력 검사
		prn =new LG();
		prn.print(myDoc);
		
		
	}

}


// 삼성 프린터 드라이버

class SAMSUNG implements Printable{

	@Override
	public void print(String doc) {
		System.out.println("삼성 프린터");
		System.out.println(doc);
		
	}
	
	
}


class LG implements Printable{

	@Override
	public void print(String doc) {
		System.out.println("엘쥐 프린트");
		System.out.println(doc);
		
		
	}
	
}









//LG 프린터 드라이버