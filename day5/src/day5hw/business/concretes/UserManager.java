package day5hw.business.concretes;

import java.util.List;

import day5hw.business.abstracts.UserService;
import day5hw.dataAccess.abstracts.UserDao;
import day5hw.entities.concretes.User;

public class UserManager implements UserService{
	UserDao userDao;

	public UserManager(UserDao userDao) {
		super();
		this.userDao = userDao;
	}

	@Override
	public void add(User user) {
		userDao.add(user);
		System.out.println("Kullan�c� ba�ar�l� bir �ekilde olu�turuldu");
		
	}

	@Override
	public void delete(User user) {
		userDao.delete(user);
		System.out.println("Kullan�c� silindi.");
	}

	@Override
	public void update(User user) {
		userDao.update(user);
		System.out.println("Kullan�c� bilgileri g�ncellendi.");
	}

	@Override
	public User getById(int id) {
		return userDao.getById(id);

	}

	@Override
	public User getByMail(String email) {
		return userDao.getByMail(email);
	}

	@Override
	public User getByEmailAndPassword(String email, String password) {
		return userDao.getByEmailAndPassword(email, password);
	}

	@Override
	public List<User> getAll() {
		return userDao.getAll();
	}
	

}
