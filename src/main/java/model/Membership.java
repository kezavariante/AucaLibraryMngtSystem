package model;

import java.util.Date;
import java.util.UUID;

public class Membership {

	private UUID membership_id;
	private int membership_type;
	private String membership_code;
	private MembershipStatus status;
	private Date exp_date;
	private UUID reader_id;
	private Date registration_date;
	
	
	public Membership() {}
	
	public Membership(UUID membership_id, int membership_type, String membership_code, MembershipStatus status,
			Date exp_date, UUID reader_id, Date registration_date) {
		super();
		this.membership_id = membership_id;
		this.membership_type = membership_type;
		this.membership_code = membership_code;
		this.status = status;
		this.exp_date = exp_date;
		this.reader_id = reader_id;
		this.registration_date = registration_date;
	}


	public UUID getMembership_id() {
		return membership_id;
	}


	public void setMembership_id(UUID membership_id) {
		this.membership_id = membership_id;
	}


	public int getMembership_type() {
		return membership_type;
	}


	public void setMembership_type(int membership_type) {
		this.membership_type = membership_type;
	}


	public String getMembership_code() {
		return membership_code;
	}


	public void setMembership_code(String membership_code) {
		this.membership_code = membership_code;
	}


	public MembershipStatus getStatus() {
		return status;
	}


	public void setStatus(MembershipStatus status) {
		this.status = status;
	}


	public Date getExp_date() {
		return exp_date;
	}


	public void setExp_date(Date exp_date) {
		this.exp_date = exp_date;
	}


	public UUID getReader_id() {
		return reader_id;
	}


	public void setReader_id(UUID reader_id) {
		this.reader_id = reader_id;
	}


	public Date getRegistration_date() {
		return registration_date;
	}


	public void setRegistration_date(Date registration_date) {
		this.registration_date = registration_date;
	}
	
	
}
