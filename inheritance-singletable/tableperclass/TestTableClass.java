package tableperclass;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class TestTableClass {
	public static void main(String[] args) {
		
		Session s= HibernateSf.createSession().openSession();
		Transaction tx= s.beginTransaction();
		
		Employe e1= new Employe();
		//e1.setId(1);
		e1.setName("rajiv");
		
		Contract_Emp c1= new Contract_Emp();
		//c1.setId(2);
		c1.setName("vinod");
		c1.setPayPerHour(45);
		
		Regular_Employe r1= new Regular_Employe();
		//r1.setId(3);
		r1.setName("ajay");
		r1.setSal(49000);
		
		s.save(r1);
		s.save(c1);
		s.save(e1);
		tx.commit();
		
	}

}
