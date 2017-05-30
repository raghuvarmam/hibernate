package hibernatedemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class DeleteHibernate {
	public static void main(String[] args) {
		SessionFactory sf= HibernateSf.createSession();
		Session s= sf.openSession();
		Transaction tx= s.beginTransaction();
		
		Student st= (Student) s.load(Student.class, 12);
		//Object o=s.load(Student.class,5);
		//Student st=(Student)o;
		s.delete(st);

		System.out.println("Object Deleted " );
		tx.commit();
		s.close();
		sf.close();
	}

}
