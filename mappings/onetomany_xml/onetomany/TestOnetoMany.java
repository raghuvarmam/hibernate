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
		
		Customer c= new Customer();
		c.setLicence(1234);
		c.setName("nithin");
		
		Vehicle v1= new Vehicle();
		v1.setVid(7);
		v1.setVname("activa");
		v1.setC(c);
		
		Vehicle v2= new Vehicle();
		v2.setVid(6);
		v2.setVname("vespa");
		v2.setC(c);
		
		List<Vehicle> l= new ArrayList<Vehicle>();
		l.add(v2);
		l.add(v1);
	
		c.setVehicle(l);
		s.save(v2);
		s.save(v1);
		s.save(c);
		
		tx.commit();
		s.close();

	

	}

}
