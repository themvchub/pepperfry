package com.themvc.pfcc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.themvc.pfcc.entity.Product;
import com.themvc.pfcc.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {

	@Autowired
	private ProductService productService;

	@GetMapping(produces = { MediaType.APPLICATION_JSON_VALUE }, path = "/all")
	public List<Product> getAllProducts() {
		return productService.getAllProducts();
	}

	@PostMapping(consumes = { MediaType.APPLICATION_JSON_VALUE }, path = "/")
	public int saveProduct(@RequestBody Product product) {
		return productService.saveProduct(product);
	}
}
