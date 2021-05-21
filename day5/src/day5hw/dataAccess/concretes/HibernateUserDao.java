package day5hw.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import day5hw.dataAccess.abstracts.UserDao;
import day5hw.entities.concretes.User;

public class HibernateUserDao implements UserDao {

	List<User> users = new ArrayList<User>();
	
	@Override
	public void add(User user) {
		users.add(user);
		System.out.println("Hibarnate ile eklendi " + user.getFirstName());

	}

	@Override
	public void delete(User user) {
		users.remove(user);

	}

	@Override
	public void update(User user) {
		for (User u : users) {
			if (u.getId() == user.getId()) {
				u.setFirstName(user.getFirstName());
				u.setLastName(user.getLastName());
				u.setEmail(user.getEmail());
				u.setPassword(user.getPassword());
			}
		}

	}

	@Override
	public User getById(int id) {
		for (User user : users) {
			if (user.getId() == id) {
				return user;
			}
		}
		return null;
	}

	@Override
	public User getByMail(String email) {
		for (User user : users) {
			if (user.getEmail() == email) {
				return user;
			}
		}
		return null;
	}

	@Override
	public User getByEmailAndPassword(String email, String password) {
		for (User user : users) {
			if (user.getEmail() == email && user.getPassword() == password) {
				return user;
			}
		}
		return null;
	}

	@Override
	public List<User> getAll() {
		return users;
	}

}
