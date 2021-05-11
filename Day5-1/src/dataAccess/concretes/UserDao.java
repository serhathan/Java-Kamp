package dataAccess.concretes;


import java.util.ArrayList;
import java.util.List;

import dataAccess.abstracts.UserDaoService;
import entities.concreter.User;

public class UserDao implements UserDaoService {
	
	private List<User>users=new ArrayList<User>();
	
	
	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}


	@Override
	public void add(User user) {
		System.out.println("Kullanıcı data ya eklendi:"+user.getFirstName());
		users.add(user);
	}

	@Override
	public void delete(User user) {
		System.out.println("Kullanıcı data ya silindi:"+user.getFirstName());
		users.remove(user);
	}

	@Override
	public void update(User user) {
		System.out.println("Kullanıcı data ya güncellendi:"+user.getFirstName());
		
	}

	@Override
	public boolean InDatabase(User user) {
		try{
			if (users.contains(user)) {
				//int index = users.indexOf(user);
				//users.get(index).geteMail()
				return true;
			}
			
		}
		catch (Exception e) {
			return false;
		}
			
		
		return false;
	}
	
	public boolean isUniqueEmail(String emailStr) {
		for (int i=0;i<users.size();i++){
			if (users.get(i).geteMail()==emailStr) {
				return false;
			}
		}
		
		return true;
	}

}
