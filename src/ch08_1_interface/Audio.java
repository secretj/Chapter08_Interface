package ch08_1_interface;

public class Audio implements RemoteControl{
	
	private int volume;
	
	public void turnOn() {
		System.out.println("������� �Ҵ�");
	}
	
	public void turnOff() {
		System.out.println("������� ����.");
	}
	
	public void setVolume(int volume) {
		if(volume >RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
			
		}else if(volume<RemoteControl.MIN_VOLUME) {
			
		}else {
			this.volume =volume;
		}
		System.out.println("���� ����� ����:"+ this.volume);
		
	}
	
}
