package dataAccess.abstracts;

import entities.concreter.User;

public interface UserDaoService {
	void add(User user);
	void delete(User user);
	void update(User user);
	boolean InDatabase(User user);
	boolean isUniqueEmail(String emailStr);
}
