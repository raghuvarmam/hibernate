package embedded.hibernate;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Table;
@Embeddable
@Table(name= "address")
public class Address {
	@Column
	private int hno;
	@Column
	private String Street;
	@Column
	private int pin;
	
	
	public Address(int hno, String street, int pin) {
		super();
		this.hno = hno;
		Street = street;
		this.pin = pin;
	}
	
	public Address() {
		// TODO Auto-generated constructor stub
	}

	public int getHno() {
		return hno;
	}
	public void setHno(int hno) {
		this.hno = hno;
	}
	public String getStreet() {
		return Street;
	}
	public void setStreet(String street) {
		Street = street;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	
	
	
	

}
