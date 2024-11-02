package model;

import java.util.UUID;

public class Shelf {

	private UUID shelf_id;
	private UUID room_id;
	private int available_stock;
	private String book_category;
	private int initial_stock;
	private int borrowed_number;
	
	
	public Shelf() {}


	public Shelf(UUID shelf_id, UUID room_id, int available_stock, String book_category, int initial_stock,
			int borrowed_number) {
		
		this.shelf_id = shelf_id;
		this.room_id = room_id;
		this.available_stock = available_stock;
		this.book_category = book_category;
		this.initial_stock = initial_stock;
		this.borrowed_number = borrowed_number;
	}


	public UUID getShelf_id() {
		return shelf_id;
	}


	public void setShelf_id(UUID shelf_id) {
		this.shelf_id = shelf_id;
	}


	public UUID getRoom_id() {
		return room_id;
	}


	public void setRoom_id(UUID room_id) {
		this.room_id = room_id;
	}


	public int getAvailable_stock() {
		return available_stock;
	}


	public void setAvailable_stock(int available_stock) {
		this.available_stock = available_stock;
	}


	public String getBook_category() {
		return book_category;
	}


	public void setBook_category(String book_category) {
		this.book_category = book_category;
	}


	public int getInitial_stock() {
		return initial_stock;
	}


	public void setInitial_stock(int initial_stock) {
		this.initial_stock = initial_stock;
	}


	public int getBorrowed_number() {
		return borrowed_number;
	}


	public void setBorrowed_number(int borrowed_number) {
		this.borrowed_number = borrowed_number;
	}
	
	
}
