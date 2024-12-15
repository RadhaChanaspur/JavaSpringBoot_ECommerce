package com.example.productcatelogservice.Controller;

import com.example.productcatelogservice.models.Product;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ProductController {

    @GetMapping("/products")
    public List<Product> getAllProducts(){
        Product product1 = new Product();
        product1.setId(1L);
        product1.setName("Watches");
        product1.setDescription("Watches for Java");

        List<Product> products = new ArrayList<Product>();
        products.add(product1);
        return products;
    }
    @GetMapping("/products/{id}")
    public  Product getProductById(@PathVariable Long id){ //@PathVariable annotation
        //to indicate that parameter listed in path and method parameter list should be mapped
        Product product = new Product();
        product.setId(id);

        return product;
    }

    @PostMapping("/products")
    public Product createProduct(@RequestBody Product product){
        return product;
    }

}
