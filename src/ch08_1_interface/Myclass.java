package ch08_1_interface;

class Myclass {
	
	RemoteControl rc =new Television("gg");
	
	Myclass(){
}
	
	Myclass(RemoteControl rc){
		this.rc=rc;
		rc.turnOn();
		rc.setVolume(5);
	}
	
	void methodA() {
		RemoteControl rc = new Audio();
		rc.turnOn();
		rc.setVolume(5);
	}
	void methodB(RemoteControl rc) {
		rc.turnOn();
		rc.setVolume(5);
	}
		
	}



