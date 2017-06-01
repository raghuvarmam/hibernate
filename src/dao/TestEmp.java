package dao;
import java.util.List;

import model.Employee;
public class TestEmp {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		EmployeeDAO ed = new EmpDAOimpl();
		
		ed.updateEmp();
			
			//List<Employee> all = ed.findAll();
			
			//all.forEach(student->System.out.println(student));
			
		

	}

}
