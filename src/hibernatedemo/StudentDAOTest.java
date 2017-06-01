package hibernatedemo;

public class StudentDAOTest {

	public static void main(String[] args) throws Exception {
		//SessionFactory sf= null;
		// TODO Auto-generated method stub
		//SessionFactory sf= HibernateSf.createSession();
		StudentDAO std = new StudentDAO();
		std.insertStudent();
		//std.deleteStudent();
		//std.fetchStudent();
		//std.updateStudent();
		//sf.close();
		

	}

}
