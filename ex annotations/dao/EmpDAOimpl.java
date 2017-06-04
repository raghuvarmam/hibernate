package dao;

import java.util.List;

import org.hibernate.Query;

import org.hibernate.Session;
import org.hibernate.Transaction;

import model.Employee;

public class EmpDAOimpl implements EmployeeDAO{
	@Override
	public boolean saveemp(Employee emp){

		if(emp == null){
			throw new RuntimeException("Student is not defined or student is null");
		}
		Session s = HibernateSf.createSession().openSession();
		Transaction tx = s.beginTransaction();

		s.save(emp);
		tx.commit();
		s.close();
		return true;
	}
	@Override
	public List<Employee> findAll(){
		Session s = HibernateSf.createSession().openSession();
		Transaction tx = s.beginTransaction();

		Query query = s.createQuery("from Employee");
		List<Employee> all = query.list();
		//s.save(all);
		tx.commit();
		s.close();
		return all;
	}
	@Override
	public void updateEmp(Employee e){
		Session s = HibernateSf.createSession().openSession();
		Transaction tx = s.beginTransaction();
		//Employee e = (Employee) s.load(Employee.class, new Integer(id));

		s.update(e);
		s.save(e);
		System.out.println("updation success");
		tx.commit();
		s.close();
	}

	public void deleteEmp(int id){
		Session s = HibernateSf.createSession().openSession();
		Transaction tx = s.beginTransaction();
		Employee e = (Employee) s.load(Employee.class, new Integer(id));
		s.delete(e);
		//s.save(e);
		System.out.println("deletion success");
		tx.commit();
		s.close();
	}

}
