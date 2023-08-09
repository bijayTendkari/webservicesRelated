package net.javaguides.springbootrestfullwebservies.Service;

import java.util.List;

import net.javaguides.springbootrestfullwebservies.entities.User;

public interface UserService {

	User createUser(User user);

	User getUserById(Long userId);

	List<User> getAllUsers();

	User updateUser(User user);

	void deleteUser(Long userId);
}
