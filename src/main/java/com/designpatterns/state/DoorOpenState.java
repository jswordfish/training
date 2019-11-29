package com.designpatterns.state;

public class DoorOpenState extends DoorState {
	
	Door door;
	
	public DoorOpenState(Door door){
		this.door = door;
	}

	@Override
	public void perform() {
		// TODO Auto-generated method stub
		door.close();
	}

}
