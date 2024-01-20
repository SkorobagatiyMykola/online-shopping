package ua.skorobahatyi.onlineshopping.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.skorobahatyi.onlineshopping.model.Account;


@Repository
public interface AccountRepository extends JpaRepository<Account,Integer> {
}
