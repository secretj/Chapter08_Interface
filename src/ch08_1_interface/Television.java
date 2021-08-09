package ch08_1_interface;

public class Television implements RemoteControl{
	//�ʵ�
	private int volume;
	private String name;
	
	public  Television(String name) {
		this.name=name;
	}
	
	@Override
	public void turnOn() {
		System.out.println(name+"TV�� �մϴ�.");
	}
	
	@Override
	public void turnOff() {
		System.out.println(name+"TV�� ���ϴ�.");
	}
	
	@Override
	public void setVolume(int volume) {
		if(volume>RemoteControl.MAX_VOLUME) {
			this.volume =RemoteControl.MAX_VOLUME;
		}else if(volume< RemoteControl.MIN_VOLUME) {
			this.volume =RemoteControl.MIN_VOLUME;
		}else {
			this.volume=volume;
		}
		System.out.println("���� TV ����: "+ this.volume);
	}
}
