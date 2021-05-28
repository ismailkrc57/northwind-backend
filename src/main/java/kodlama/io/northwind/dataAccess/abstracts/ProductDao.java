package kodlama.io.northwind.dataAccess.abstracts;

import io.swagger.models.auth.In;
import kodlama.io.northwind.entities.concretes.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductDao extends JpaRepository<Product,Integer> {
    Product getByProductName(String productName);
    Product getByProductNameAndCategory_CategoryId(String productName,int categoryId);
    List<Product> getByProductNameOrCategory_CategoryId(String productName, int categoryName);
    List<Product> getByCategoryIn(List<Integer> categories);
    List<Product> getByProductNameContains(String productName);
    List<Product> getByProductNameStartsWith(String productName);

    @Query("From Product WHERE productName=:productName and category.categoryId=:categoryId")
    List<Product> getByNameAndCategory(String productName, int categoryId);
}
