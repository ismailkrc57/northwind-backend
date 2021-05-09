package kodlama.io.northwind.business.abstracts;

import kodlama.io.northwind.entities.concretes.Product;

import java.util.List;

public interface ProductService {
    List<Product> getAll();
}
