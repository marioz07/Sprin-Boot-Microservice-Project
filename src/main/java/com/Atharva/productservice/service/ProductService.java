package com.Atharva.productservice.service;



import com.Atharva.productservice.dto.ProductResponse;
import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import com.Atharva.productservice.dto.ProductRequest;
import com.Atharva.productservice.model.Product;
import com.Atharva.productservice.repository.ProductRepository;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
@Component
public class ProductService {

	private final ProductRepository productRepository;


	public void createProduct(ProductRequest productrequest) {
		Product product = Product.builder()
				.name(productrequest.getName())
				.description(productrequest.getDescription())
				.price(productrequest.getPrice())
				.build();

		productRepository.save(product);

//		log.info("Product {} is saved"+ product.getId());

	}

	public List<ProductResponse> getAllproducts() {
		List<Product> products =  productRepository.findAll();
		return products.stream().map(this::mapToProductResponse).toList();
	}

	//This method takes a Product object as input and uses the builder pattern to create and return a corresponding ProductResponse object.
	private ProductResponse mapToProductResponse(Product product) {
		return ProductResponse.builder()
				.id(product.getId())
				.name(product.getName())
				.description(product.getDescription())
				.price(product.getPrice())
				.build();
	}
}
