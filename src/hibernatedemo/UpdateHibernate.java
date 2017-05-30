package hibernatedemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class UpdateHibernate {
	public static void main(String[] args) {
		
		SessionFactory sf= HibernateSf.createSession();
		Session s= sf.openSession();
		Transaction tx= s.beginTransaction();
		
//		Employee e= (Employee) s.load(Employee.class, new Integer(10));
//		e.setEname("pawan");
//		e.setSal(1000);
		Student st= (Student) s.load(Student.class, 11);
		st.setSname("vinay");
		
		System.out.println("employee updated succesfully ");
		tx.commit();
		s.close();
		sf.close();
	}

}
