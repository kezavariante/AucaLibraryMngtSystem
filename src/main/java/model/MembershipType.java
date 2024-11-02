package model;

import java.util.UUID;

public class MembershipType {

	private UUID membershipType_id;
	private String membershipType_name;
	private int max_book;
	private int price;
	
	public MembershipType() {}
	
	
	public MembershipType(UUID membershipType_id, String membershipType_name, int max_book, int price) {
		this.membershipType_id = membershipType_id;
		this.membershipType_name = membershipType_name;
		this.max_book = max_book;
		this.price = price;
	}


	public UUID getMembershipType_id() {
		return membershipType_id;
	}


	public void setMembershipType_id(UUID membershipType_id) {
		this.membershipType_id = membershipType_id;
	}


	public String getMembershipType_name() {
		return membershipType_name;
	}


	public void setMembershipType_name(String membershipType_name) {
		this.membershipType_name = membershipType_name;
	}


	public int getMax_book() {
		return max_book;
	}


	public void setMax_book(int max_book) {
		this.max_book = max_book;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}
	
	
}
