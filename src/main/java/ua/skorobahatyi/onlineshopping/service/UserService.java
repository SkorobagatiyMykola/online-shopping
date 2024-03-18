package ua.skorobahatyi.onlineshopping.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import ua.skorobahatyi.onlineshopping.dto.UserDto;
import ua.skorobahatyi.onlineshopping.model.User;
import ua.skorobahatyi.onlineshopping.repository.UserRepository;

import java.util.List;

@Service
public class UserService {
    private static final Logger logger = LogManager.getLogger(UserService.class);

    private final UserRepository userRepository;
    private final ModelMapper modelMapper;


    @Autowired
    public UserService(UserRepository userRepository, ModelMapper modelMapper) {
        this.userRepository = userRepository;
        this.modelMapper = modelMapper;
    }

    public User getUser(Integer id) {
        //logger.debug("Get User with id {}", id);
        //Assert.notNull(id, "User id must not be null");
        //return userRepository.findById(id).orElseThrow(() -> new ChangeSetPersister.NotFoundException(String.format("Unknown user %s", id)));
        return userRepository.findById(id).orElseThrow();
    }

    public User createUser(User user) {
        //logger.debug("Create User");
        // Assert.notNull(user, "User must not be null");
        user = userRepository.save(user);
        //  logger.info("User with id {} has been saved on checkout db", user.getId());

        return user;
    }

    public List<User> getUsers() {
        //logger.debug("Get all Users ");
        return userRepository.findAll();
    }

    public void deleteUserById(Integer id) {
        userRepository.deleteById(id);

    }

    public User updateUserById(Integer id, UserDto userDto) {
        logger.debug("Update User");

        //modelMapper.map(userDto, user);

        userRepository.updateUser(id, userDto.getName(), userDto.getSurname(), userDto.getAge());
        User user = getUser(id);
        logger.info("Updated user with id: {}", id);
        return user; // todo (!!!)
    }

}
