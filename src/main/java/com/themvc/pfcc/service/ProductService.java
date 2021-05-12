package com.themvc.pfcc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.themvc.pfcc.entity.Product;
import com.themvc.pfcc.repo.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository productRepo;

	public List<Product> getAllProducts() {
		System.out.println("Executed...");
		return productRepo.findAll();
	}
}
