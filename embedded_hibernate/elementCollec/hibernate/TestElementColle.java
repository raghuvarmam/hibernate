package elementCollec.hibernate;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import embedded.hibernate.Address;
import embedded.hibernate.Employee;
import embedded.hibernate.HibernateSf;

public class TestElementColle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session s = HibernateSf.createSession().openSession();
		Transaction tx = s.beginTransaction();
		
		Address a1= new Address(141,"mayo st", 75428);
		Address a2= new Address(142,"washington st", 75429);
		List<Address> all= new ArrayList<Address>();
		all.add(a1);
		all.add(a2);
		
		Person p = new Person(1,"software Engineer",all);
		
		
		s.save(p);
		tx.commit();
		s.close();

	}

}
