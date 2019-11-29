package com.designpatterns.state;

public class Door {
	
	DoorState doorState;
	
	public void action(){
		doorState.perform();
	}

	public DoorState getDoorState() {
		return doorState;
	}

	public void setDoorState(DoorState doorState) {
		this.doorState = doorState;
		this.doorState.perform();
	}
	
	public void open(){
		//setDoorState(new DoorOpenState(this));
		System.out.println("Opening Door");
	}
	
	public void close(){
		//setDoorState(new DoorCloseState(this));
		System.out.println("Closing Door");
	}

}
