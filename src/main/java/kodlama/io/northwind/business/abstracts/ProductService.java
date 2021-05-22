package kodlama.io.northwind.business.abstracts;

import kodlama.io.northwind.core.utilities.results.DataResult;
import kodlama.io.northwind.core.utilities.results.Result;
import kodlama.io.northwind.entities.concretes.Product;

import java.util.List;

public interface ProductService {
    DataResult<List<Product>> getAll();
    Result add(Product product);
}
