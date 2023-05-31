package miu.edu.inclassdemojune.repo;


import miu.edu.inclassdemojune.domain.Product;
import miu.edu.inclassdemojune.domain.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductRepo extends JpaRepository<Product,Integer> {


    List<Product>findProductByPriceGreaterThan(int price);
}
