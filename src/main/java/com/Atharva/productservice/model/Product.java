package com.Atharva.productservice.model;

import java.math.BigDecimal;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(value="product") //To define this as product mongodb document
@AllArgsConstructor // This annotation instructs Lombok to generate a constructor that includes all the fields of the class as parameters.
@NoArgsConstructor
@Builder
@Data
public class Product {
	@Id
	private String id;
	private String name;
	private String description;
	private BigDecimal price;
	
}
