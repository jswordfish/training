package com.designpatterns.state;

public class DoorCloseState extends DoorState {
	

	Door door;
	
	public DoorCloseState(Door door){
		this.door = door;
	}

	@Override
	public void perform() {
		// TODO Auto-generated method stub
		door.open();
	}

}
