package hibernatedemo;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

//import org.hibernate.annotations.Entity;



@javax.persistence.Entity
@Table(name ="student")
public class Student {
	@Id @Column(name ="rnum")
	private int rnum;
	@Column(name = "sname")
	private String sname;
	
	
	public int getRnum() {
		return rnum;
	}
	public void setRnum(int rnum) {
		this.rnum = rnum;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	

}
