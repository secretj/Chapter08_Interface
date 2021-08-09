package ch08_3_example;

//숙제 ^^
class SP204Driver implements Printable{
	
	@Override
	public void print(String doc) {
		System.out.println("인정이프린터");
		System.out.println(doc+"\n");
		
	}

}
class LP870Driver implements Printable {

	@Override
	public void print(String doc) {
		System.out.println("진형이프린터");
		System.out.println(doc);
		
	}
}
public class PrinterTest2 {
	public static void main(String[] args) {
		
		String myDoc="뇸뇸뇸뇸";
		Printable prn= null;
		
		prn = new SP204Driver();
		prn.print(myDoc);
		
		prn = new LP870Driver();
		prn.print(myDoc);
		
		
		
		
		//이러면 되나 ;?
		
		
		
	}

}
