package onetoone.hibernate;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class TestOneToOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session s = HibernateSf.createSession().openSession();
		Transaction tx = s.beginTransaction();
		
		Vehicle v1= new Vehicle();
		v1.setVid(3);
		v1.setVname("fz");
		
		UserDetails u= new UserDetails();
		u.setUid(3);
		u.setUname("abhi");
		u.setVehicle(v1);
		
		s.save(v1);
		s.save(u);
		
		tx.commit();
		s.close();

	}

}
