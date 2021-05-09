package kodlama.io.northwind.entities.concretes;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue
    @Column(name = "product_id")
    private int id;

    @Column(name = "category_id")
    private int categoryId;

    @Column(name = "product_name")
    private String productName;

    @Column(name = "unit_price")
    private double unitePrice;

    @Column(name = "units_in_stock")
    private short unitsInStock;

    @Column(name = "quantity_per_unit")
    private String quantityPerUnit;

    public Product() {

    }

    public Product(int id, int categoryId, String productName, double unitePrice, short unitsInStock, String quantityPerUnit) {
        this.id = id;
        this.categoryId = categoryId;
        this.productName = productName;
        this.unitePrice = unitePrice;
        this.unitsInStock = unitsInStock;
        this.quantityPerUnit = quantityPerUnit;
    }


}
