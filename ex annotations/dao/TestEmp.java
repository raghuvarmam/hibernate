package dao;
import java.util.List;

import model.Employee;
public class TestEmp {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		EmployeeDAO ed = new EmpDAOimpl();
		Employee e1= new Employee(3,"ramu",25000,"Manager");
		Employee e2= new Employee(2,"vishal",500000,"M.D");

		//ed.saveemp(e1);
		//ed.deleteEmp(1);
		//ed.updateEmp(e2);
			
			List<Employee> all = ed.findAll();
			
			all.forEach(student->System.out.println(student));
			
		

	}

}
