package business.abstracts;

import entities.concreter.User;

public interface UserService {
	void add(User user);
	void delete(User user);
}
