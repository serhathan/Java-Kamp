
import business.abstracts.UserService;
import business.concretes.CheckValidRegex;
import business.concretes.UserManager;
import dataAccess.abstracts.UserDaoService;
import dataAccess.concretes.UserDao;
import entities.concreter.User;

public class Main {

	public static void main(String[] args) {
		User user=new User(1,"serhathan98@gmail.com","1234eE*/","Serhat","Güney");
		User user1=new User(2, "sekobaba@email.com", "Eer01211/", "Seko", "Baba");
		User user3=new User(6,"serhathan98@email.com","1234eE*/","Sezcxz","Güney");
		
		UserDao dao=new UserDao();
		
		UserService userService=new UserManager(new CheckValidRegex(),dao);
		userService.add(user);
		userService.add(user1);
		userService.add(user3);
		userService.delete(user3);
	}

}
