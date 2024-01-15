package ua.skorobahatyi.onlineshopping.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ua.skorobahatyi.onlineshopping.model.User;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {
}
