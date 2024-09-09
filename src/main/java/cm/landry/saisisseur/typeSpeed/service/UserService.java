package cm.landry.saisisseur.typeSpeed.service;

import java.util.List;
import java.util.Optional;

import cm.landry.saisisseur.typeSpeed.entity.User;

public interface UserService {
    User saveUser(User user);
    Optional<User> getUserById(Long id);
    List<User> getAllUsers();
    void deleteUser(Long id);
}
