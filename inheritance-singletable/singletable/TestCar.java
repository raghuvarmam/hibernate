package singletable;

import org.hibernate.Session;
import org.hibernate.Transaction;


public class TestCar {
	public static void main(String[] args) {
		Session s = HibernateSf.createSession().openSession();
		Transaction tx = s.beginTransaction();
		
		Car c= new Car();
		c.setCapacity(2);
		c.setModel("coop");
		
		Audi a= new Audi();
		a.setCost("5000000");
		a.setModel("suv");
		
		Bmw b= new Bmw();
		b.setCapacity(5);
		b.setModel("sedan");
		b.setFuel("petrol");
		
		
		s.save(a);
		s.save(b);
		s.save(c);
		
		tx.commit();
		s.close();
		
	}


}
