package miu.edu.inclassdemojune.domain;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String title;

    @ManyToMany(mappedBy = "categories")
    List<Product> products;
}
