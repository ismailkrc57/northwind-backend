package kodlama.io.northwind.dataAccess.abstracts;

import kodlama.io.northwind.entities.concretes.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductDao extends JpaRepository<Product,Integer> {
}
