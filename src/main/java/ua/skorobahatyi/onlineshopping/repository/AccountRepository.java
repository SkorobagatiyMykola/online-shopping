package ua.skorobahatyi.onlineshopping.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.skorobahatyi.onlineshopping.model.Account;

public interface AccountRepository extends JpaRepository<Account,Integer> {
}
