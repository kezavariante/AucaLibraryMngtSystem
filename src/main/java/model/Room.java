package model;

import java.util.UUID;

public class Room {

	private UUID room_id;
	private String room_code;
	
	public Room() {}

	public Room(UUID room_id, String room_code) {
		
		this.room_id = room_id;
		this.room_code = room_code;
	}

	public UUID getRoom_id() {
		return room_id;
	}

	public void setRoom_id(UUID room_id) {
		this.room_id = room_id;
	}

	public String getRoom_code() {
		return room_code;
	}

	public void setRoom_code(String room_code) {
		this.room_code = room_code;
	}
	
	
}
