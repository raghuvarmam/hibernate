package embedded.hibernate;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class TestEmbed {

	/*public static void main(String[] args) {
		Session s = HibernateSf.createSession().openSession();
		Transaction tx = s.beginTransaction();
		Address a= new Address();
		a.setHno(123);
		a.setStreet("live oak");
		a.setPin(75012);
		Employee e= new Employee(4,"siva",40000,"G.M");
		e.setAddr(a);
		s.save(e);
		tx.commit();
		s.close();
		
	}*/

}
