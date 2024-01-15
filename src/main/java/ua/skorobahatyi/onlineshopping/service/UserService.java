package ua.skorobahatyi.onlineshopping.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Service;
import ua.skorobahatyi.onlineshopping.model.User;
import ua.skorobahatyi.onlineshopping.repository.UserRepository;

import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User getUser(Long id) {
        //logger.debug("Get User with id {}", id);
        Assert.notNull(id, "User id must not be null");
        return userRepository.findById(id).orElseThrow(() -> new ChangeSetPersister.NotFoundException(String.format("Unknown user %s", id)));
    }

    public User createUser(User user) {
        //logger.debug("Create User");
        Assert.notNull(user, "User must not be null");
        user = userRepository.save(user);
      //  logger.info("User with id {} has been saved on checkout db", user.getId());

        return user;
    }

    public List<User> getUsers() {
        //logger.debug("Get all Users ");
        return userRepository.findAll();
    }
//
//    public User createUser(User userBody) {
//    }
//
//    public List<User> getUsers() {
//    }
//
//    public User getUser(Long id) {
//    }
}
