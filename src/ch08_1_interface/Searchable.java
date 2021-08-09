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
		System.out.println(name +"TV를 켭니다.");
	}
	
	public void turnOff() {
		System.out.println(name +"TV를 끈다.");
	}
	
	public void setVolume(int volume) {
		if(volume >RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
			
		}else if(volume<RemoteControl.MIN_VOLUME) {
			
		}else {
			this.volume =volume;
		}
		System.out.println("현재 TV 볼륨:"+ this.volume);
	}

	public void search(String url) {
		System.out.println(url + "을 검색합니다.");
	}
}

