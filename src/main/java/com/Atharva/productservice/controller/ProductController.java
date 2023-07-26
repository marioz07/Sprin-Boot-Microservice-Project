package com.Atharva.productservice.controller;

import com.Atharva.productservice.dto.ProductResponse;
import com.Atharva.productservice.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import com.Atharva.productservice.dto.ProductRequest;

import java.util.List;

@RestController
@RequestMapping("/api/product")
@RequiredArgsConstructor //@RequiredArgsConstructor is used to instruct Lombok to generate a constructor for a class that includes all the final fields as parameters.
public class ProductController {

		private final ProductService productService;
		@PostMapping
		@ResponseStatus(HttpStatus.CREATED)
		public void createProduct(@RequestBody ProductRequest productRequest) {
			productService.createProduct(productRequest);
		}

		//retrieve product
		@GetMapping
		@ResponseStatus(HttpStatus.OK)
		public List<ProductResponse> getAllProducts(){
			return productService.getAllproducts();
		}


}
