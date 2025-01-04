package com.amt.rest.webservices.restful_web_services.user;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Component;

@Component
public class UserDaoService {
	// JPA/Hibernate -> DataBase
	// UserDaoService -> Static List

	private static List<User> users = new ArrayList<>();

	private static int usersCount = 0;
	static {
		users.add(new User(++usersCount, "Mg Mg", LocalDate.now().minusYears(30)));
		users.add(new User(++usersCount, "Ma Ma", LocalDate.now().minusYears(28)));
		users.add(new User(++usersCount, "Mg Zaw", LocalDate.now().minusYears(40)));
	}

	public List<User> findAll() {
		return users;
	}

	public User save(User user) {
		user.setId(++usersCount);
		users.add(user);
		return user;
	}

	public User findOne(int id) {
		Predicate<? super User> predicate = user -> user.getId().equals(id);
		return users.stream().filter(predicate).findFirst().orElse(null);
	}
	
	public void deleteById(int id) {
		Predicate<? super User> predicate = user -> user.getId().equals(id);
		users.removeIf(predicate);
	}
}
