package hibernatedemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DemoEmp {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		Configuration cfg= new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		
		Student st= new Student();
		st.setRnum(12);
		st.setSname("sai");
		
		s.save(st);
//		Employee e= new Employee();
//		e.setEid(101);
//		e.setEname("rahim");
//		e.setRole("sr manager");
//		e.setSal(30000);
//		s.save(e);
		System.out.println("success");
		tx.commit();
		s.close();
		sf.close();
	}
}


