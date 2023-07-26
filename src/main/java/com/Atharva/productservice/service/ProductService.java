package com.Atharva.productservice.service;



import lombok.extern.slf4j.Slf4j;

import org.springframework.stereotype.Service;

import com.Atharva.productservice.dto.ProductRequest;
import com.Atharva.productservice.model.Product;
import com.Atharva.productservice.repository.ProductRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
@Slf4j
public class ProductService {
	
	private final ProductRepository productRepository;

	
	public void createProduct(ProductRequest productrequest) {
		Product product = Product.builder()
				.name(productrequest.getName())
				.description(productrequest.getDescription())
				.price(productrequest.getPrice())
				.build();

		productRepository.save(product);

		log.info("Product {} is saved"+ product.getId());

	}
}
