package ua.skorobahatyi.onlineshopping.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.time.LocalDate;


@Entity
@Table (name="user")
@Data
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
