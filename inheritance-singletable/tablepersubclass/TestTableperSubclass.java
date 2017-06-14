package tableperSubclass;

import org.hibernate.Session;
import org.hibernate.Transaction;

import tableperclass.Contract_Emp;
import tableperclass.Employe;
import tableperclass.HibernateSf;
import tableperclass.Regular_Employe;

public class TestTableperSubclass {
	public static void main(String[] args) {
		Session s= new HibernateSf().createSession().openSession();
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
		s.save(e1);
		s.save(c1);
		s.save(e1);
		s.close();
		tx.commit();

		
	}
		
		
	}


