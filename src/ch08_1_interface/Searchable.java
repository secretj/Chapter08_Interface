package ch08_1_interface;

interface Searchable {
	 public abstract void search(String url);

}

class SmartTelevision implements RemoteControl, Searchable{
	
	private int volume;
	private String name;

	public  SmartTelevision(String name) {
		this.name=name;
	
		
	}


	public void turnOn() {
		System.out.println(name +"TV�� �մϴ�.");
	}
	
	public void turnOff() {
		System.out.println(name +"TV�� ����.");
	}
	
	public void setVolume(int volume) {
		if(volume >RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
			
		}else if(volume<RemoteControl.MIN_VOLUME) {
			
		}else {
			this.volume =volume;
		}
		System.out.println("���� TV ����:"+ this.volume);
	}

	public void search(String url) {
		System.out.println(url + "�� �˻��մϴ�.");
	}
}

