package onetomany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import onetoone.hibernate.HibernateSf;


public class TestOnetoMany {

	public static void main(String[] args) {
		
		Session s = HibernateSf.createSession().openSession();
		Transaction tx = s.beginTransaction();
		
		Vehicle v1= new Vehicle();
		v1.setVid(5);
		v1.setVname("fazor");
		
		Vehicle v2= new Vehicle();
		v2.setVid(4);
		v2.setVname("bajaj");
		
		List<Vehicle> l= new ArrayList<Vehicle>();
		l.add(v2);
		l.add(v1);
	
		Customer c= new Customer();
		c.setLicence(4567);
		c.setName("tilak");
		c.setVehicle(l);
		s.save(c);
		
		tx.commit();
		s.close();

	

	}

}
