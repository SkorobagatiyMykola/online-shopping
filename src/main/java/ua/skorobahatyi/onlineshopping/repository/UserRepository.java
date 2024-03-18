package ua.skorobahatyi.onlineshopping.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ua.skorobahatyi.onlineshopping.model.User;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {


    @Modifying ()
    @Transactional
    @Query("UPDATE User u SET u.name = :name, u.surname = :surname, u.age = :age WHERE u.id = :id")
    void updateUser(@Param("id") Integer id,
                    @Param("name") String name,
                    @Param("surname") String surname,
                    @Param("age") Integer age);
}
