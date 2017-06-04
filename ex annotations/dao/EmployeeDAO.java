package dao;

import java.util.List;

import model.Employee;

public interface  EmployeeDAO {
	
	public boolean saveemp(Employee emp);
	public List<Employee> findAll();
	public void updateEmp(Employee e);
	public void deleteEmp(int id);
	

}
