package ua.skorobahatyi.onlineshopping.repository;

import org.springframework.data.repository.CrudRepository;
import ua.skorobahatyi.onlineshopping.model.User;

public interface UserRepository extends CrudRepository<User,Integer> {
}
