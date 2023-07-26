package com.Atharva.productservice.controller;

import com.Atharva.productservice.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.Atharva.productservice.dto.ProductRequest;

@RestController
@RequestMapping("/api/product")
@RequiredArgsConstructor
public class ProductController {

		private final ProductService productService;
		@PostMapping
		@ResponseStatus(HttpStatus.CREATED)
		public void createProduct(@RequestBody ProductRequest productRequest) {
			productService.createProduct(productRequest);
		}

		//retrieve product

}
