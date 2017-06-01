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
	public List<Employee> findAll(){
		Session s = HibernateSf.createSession().openSession();
		Transaction tx = s.beginTransaction();
		
		Query q= (Query) s.createQuery("from Employee");
		List<Employee> all= ((org.hibernate.Query) q).list();

		tx.commit();
		s.close();
		return all;
	}
	public void updateEmp(){
		Session s = HibernateSf.createSession().openSession();
		Transaction tx = s.beginTransaction();

		Object emp= s.load(Employee.class, 1);
		Employee e=(Employee) emp;
		e.setEname("raghu");

		tx.commit();
		s.close();
	}
	public void insertEmp(){
		Session s = HibernateSf.createSession().openSession();

		Transaction tx = s.beginTransaction();

		Employee e=new Employee();
		e.setEid(1);
		e.setEname("abdul");
		e.setRole("clerk");
		e.setSal(7000);
		s.save(e);
		System.out.println("insertion success");
		tx.commit();

		s.close();



	}

}
