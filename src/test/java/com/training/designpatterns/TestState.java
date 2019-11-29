package com.training.designpatterns;

import org.junit.Test;

import com.designpatterns.state.Door;
import com.designpatterns.state.DoorCloseState;
import com.designpatterns.state.DoorOpenState;

public class TestState {
	@Test
	public void testStatePattern(){
		Door door = new Door();
		
		DoorOpenState doorOpenState = new DoorOpenState(door);
//		
//		
		DoorCloseState doorCloseState = new DoorCloseState(door);
		/**
		 * If the door state is open it will close the door
		 */
		door.setDoorState(doorOpenState);
		
		/**
		 * If the door state is open it will open the door
		 */
		door.setDoorState(doorCloseState);
		
		
	}

}
