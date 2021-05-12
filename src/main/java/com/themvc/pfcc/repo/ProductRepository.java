package com.themvc.pfcc.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.themvc.pfcc.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

}
