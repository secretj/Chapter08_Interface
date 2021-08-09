package ch08_1_interface;

public class SmartTelevionExample {

	public static void main(String[] args) {
		SmartTelevision tv = new SmartTelevision("»ï¼º");
		
		RemoteControl rc =tv;
		rc.turnOn();
		
		Searchable searchable= tv;
		searchable.search("www.google.com");

	}

}
