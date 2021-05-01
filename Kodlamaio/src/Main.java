
public class Main {

	public static void main(String[] args) {
		Student student1 = new Student();
		student1.setFirstName("Emre");
		student1.setLastName("Mahmutoğlu");
		student1.setId(1);
		student1.setMail("emre123@hotmail.com");
		student1.setPassword("12334");
		
		Student student2 = new Student();
		student2.setFirstName("Neşe");
		student2.setId(2);
		student2.setLastName("Türk");
		student2.setMail("neşe123@hotmail.com");
		student2.setPassword("1231232");
		
		Instructor instructor1 = new Instructor();
		instructor1.setCertificates("C#,C++");
		instructor1.setFirstName("Engin");
		instructor1.setLastName("Demiroğ");
		instructor1.setInstructorid(1);
		instructor1.setMail("engin3234@outlook.com");
		instructor1.setPassword("23452345");
		
		
		Instructor instructor2 = new Instructor(); 
			instructor2.setCertificates("C#,Java");
			instructor2.setFirstName("Sinan");
			instructor2.setLastName("Türk");
			instructor2.setInstructorid(2);
			instructor2.setMail("Sinan345@gmail.com");
			instructor2.setPassword("8989");
	
		Student[] students= {student1,student2};
		User[] users = {student1,student2,instructor1,instructor2};
		StudentService studentService = new StudentService();
		UserManager userManager= new UserManager();
		userManager.GetUserMail(instructor2);
		System.out.println("------");
		userManager.GetAllUsersMail(users);
		System.out.println("------");
		studentService.Add(student2);
		studentService.Del(student1);
		studentService.GetAll(students);
	}

}
