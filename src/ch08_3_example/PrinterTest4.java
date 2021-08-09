package ch08_3_example;

interface NewPrintable{
	void print(String doc);
	default void printCMYK(String doc) {
		System.out.println("せせせせせせせせせせ\n");
	}  //default研 細戚檎 析鋼五社球研 昔斗凪戚什照拭辞 識情拝呪赤陥.
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
		System.out.println("せ");
		
		
	}
	@Override
	public void printCMYK(String doc) {
		System.out.println("せせ");
	}
}


public class PrinterTest4 {
	public static void main(String[] args) {
		
	
	
	String doc ="勅勅勅";
	NewPrintable npt = new NewDriver();
	
	npt.print(doc);
	npt.printCMYK(doc);
	
	
}
}