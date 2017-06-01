package hibernatedemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class StudentDAO {
	static Transaction tx = null;
	static SessionFactory sf = null;
	static Session s = null;
	
	public static Session getSession() throws Exception{


		if(sf == null)
		{
			sf = HibernateSf.createSession();
			s = sf.openSession();
		}
		return s;
	}
	
	public void insertStudent() throws Exception{
		
		s= StudentDAO.getSession();
		tx=s.beginTransaction();
		Student st= new Student();
		st.setRnum(12);
		st.setSname("sai");	
		s.save(st);
		System.out.println("insertion success");
		tx.commit();
		s.close();
		sf.close();
	}
	
	public void updateStudent() throws Exception{
		s= StudentDAO.getSession();
		tx=s.beginTransaction();
		Student st= (Student) s.load(Student.class, 11);
		st.setSname("vinay");
		System.out.println(" updated succesfully ");
		tx.commit();
		s.close();
		
		
	}
	public void deleteStudent() throws Exception{
		s= StudentDAO.getSession();
		tx=s.beginTransaction();
		Student st= (Student) s.load(Student.class, 11);
		s.delete(st);
		System.out.println(" deleted succesfully ");
		tx.commit();
		s.close();
			
	}
	public void fetchStudent() throws Exception{
		s= StudentDAO.getSession();
		tx=s.beginTransaction();
		Student st= (Student) s.load(Student.class, 11);
		System.out.println("fetching student " +s.getEntityName(st) );
		System.out.println(" updated succesfully ");
		tx.commit();
		s.close();
		
		
	}
	
	

}
