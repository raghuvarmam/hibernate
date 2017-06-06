package onetoone.hibernate;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateSf {

	static SessionFactory sf= null;
	public static SessionFactory createSession(){
		if (sf==null)
			sf=new Configuration().configure().buildSessionFactory();		
		return sf;
	}

}
