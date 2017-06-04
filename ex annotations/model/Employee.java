package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@javax.persistence.Table(name ="employee")
public class Employee {
	@Id
	private int eid;
	@Column
	private String ename;
	@Column
	private int sal;
	
	private String role;
	
	
	public Employee() {
		super();
	}
	
	public Employee(int eid, String ename, int sal, String role) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.sal = sal;
		this.role = role;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	@Column
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	@Override
	public String toString() { 
		
		return "Student [eid=" + eid + ", ename=" + ename + ", role=" + role +", sal = "+sal+ "]";
	}
	
	
	

}
