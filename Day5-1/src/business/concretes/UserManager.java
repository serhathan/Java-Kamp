package business.concretes;

import business.abstracts.UserService;
import dataAccess.abstracts.UserDaoService;
import entities.concreter.User;

public class UserManager implements UserService {
	private CheckValidRegex regex;
	private UserDaoService userDao;
	
	public UserManager(CheckValidRegex regex,UserDaoService userDao) {
		super();
		this.regex = regex;
		this.userDao=userDao;
	}
	
	public void add(User user) {
		if(!userDao.InDatabase(user)) {
			if(regex.isValidEmail(user.geteMail())) {
				if(regex.isValidPassword(user.getPassword())) {
					if (userDao.isUniqueEmail(user.geteMail())) {
						if(regex.isValidName(user.getFirstName())) {
							userDao.add(user);
						}
						else {
							System.out.println("İsminiz 2 karakterden fazla olmalı.");
						}
					}
					else {
						System.out.println("E-mail daha önceden kullanılıyor.");
					}
				}
				else {
					System.out.println("Şifreniz en az 6 karater olmalı ve bütk küçük ve özel harf içermeli.");
				}
			}
			else {
				System.out.println("E-mail yazım kurallarına uymuyorsunuz.");
			}
		}
		else {
			System.out.println("Bu kişi var.");
		}
	}
	
	public void delete(User user) {
		if (userDao.InDatabase(user)) {
			userDao.delete(user);
		}
	}
}
	
