package miu.edu.inclassdemojune.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private int starCount;
    private double price;

    @OneToMany
    @JoinColumn(name = "product_id")
    private List<Review> reviews;

    @ManyToMany
    List<Category> categories;

    public Product(int id, String name, float price, List<Review> reviews) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.reviews = reviews;
    }

}
