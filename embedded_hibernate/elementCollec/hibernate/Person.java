package elementCollec.hibernate;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;

import embedded.hibernate.Address;

@Entity
public class Person {
	@Id
	private int id;
	@Column
	private String job;
	
	@ElementCollection
	private List<Address> al;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public List<Address> getAl() {
		return al;
	}

	public void setAl(List<Address> al) {
		this.al = al;
	}

	public Person(int id, String job, List<Address> al) {
		super();
		this.id = id;
		this.job = job;
		this.al = al;
	}
	

	
}
