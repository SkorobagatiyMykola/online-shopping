package ua.skorobahatyi.onlineshopping.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;


@Entity
@Table (name="user")
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String surname;
    private int age;
//    private String email;
//    private LocalDate created_at;
//    private LocalDate updated_at;
}
