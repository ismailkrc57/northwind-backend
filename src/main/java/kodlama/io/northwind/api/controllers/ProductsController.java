package kodlama.io.northwind.api.controllers;

import kodlama.io.northwind.business.abstracts.ProductService;
import kodlama.io.northwind.core.utilities.results.DataResult;
import kodlama.io.northwind.core.utilities.results.Result;
import kodlama.io.northwind.entities.concretes.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductsController {
    private ProductService productService;

    @Autowired
    public ProductsController(ProductService productService) {
        this.productService = productService;
    }


    @GetMapping("/getall")
    public DataResult<List<Product>> getAll() {

        return this.productService.getAll();
    }

    @PostMapping("/add")
    public Result add(@RequestBody Product product) {
        return this.productService.add(product);
    }

    @GetMapping("/getByProductName")
    public DataResult<Product> getByProductName(@RequestParam String productName) {
        return this.productService.getByProductName(productName);
    }

    @GetMapping("/getByProductNameAndCategoryId")
    public DataResult<Product> getByProductNameAndCategoryId(@RequestParam("productName") String productName, @RequestParam("categoryId") int categoryId) {

        return this.productService.getByProductNameAndCategoryId(productName, categoryId);
    }

    @GetMapping("/getByProductNameContains")
    public DataResult<List<Product>> getByProductNameContains(@RequestParam String productName)
    {
        return this.productService.getByProductNameContains(productName);
    }

    @GetMapping("/getAllBypage")
    public DataResult<List<Product>> getAll(int pageNo,int pageSize)
    {
        return this.productService.getAll(pageNo-1,pageSize);
    }

    @GetMapping("/findAllDesc")
    public DataResult<List<Product>> getAllSorted()
    {
        return this.productService.getAllSorted();
    }

    @GetMapping("/getByProductNameStartsWith")
    public DataResult<List<Product>> getByProductNameStartsWith(String productName)
    {
        return this.productService.getByProductNameStartsWith(productName);
    }
    @GetMapping("/getByNameAndCategoryWithQuery")
    public DataResult<List<Product>> getByNameAndCategory(String productName, int categoryId)
    {
       return this.productService.getByNameAndCategory(productName,categoryId);
    }
}
