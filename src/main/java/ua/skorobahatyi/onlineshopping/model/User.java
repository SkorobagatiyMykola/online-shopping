package ua.skorobahatyi.onlineshopping.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDate;


@Entity
@Table (name="user")
public class User {
    @Id
    private int id;
    private String name;
    private String surname;
    private int age;
//    private String email;
//    private LocalDate created_at;
//    private LocalDate updated_at;
}
