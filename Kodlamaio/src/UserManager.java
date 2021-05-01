
public class UserManager {
 
	public void GetUserMail (User user) {System.out.println(user.getMail());}
	
	
	public void GetAllUsersMail(User[] users) { for (User user2 : users) {System.out.println(user2.getMail());}
	}
	
	
}
