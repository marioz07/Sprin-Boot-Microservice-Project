package com.Atharva.productservice.repository;
import com.Atharva.productservice.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface ProductRepository extends MongoRepository<Product, String>{

}
