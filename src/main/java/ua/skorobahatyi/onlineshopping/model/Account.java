package ua.skorobahatyi.onlineshopping.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name = "account")
public class Account {
    @Id
    private int userId;
}
