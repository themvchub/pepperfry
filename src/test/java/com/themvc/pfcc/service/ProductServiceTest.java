package com.themvc.pfcc.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductServiceTest {

	@Autowired
	private ProductService productService;

	/*
	 * @MockBean private ProductRepository productRepo;
	 */
	@Test
	public void productServiceAvailibiltyTest() {
		assertNotNull(productService);
	}

	@Test
	public void allProductsTest() {

		/*
		 * when(productService.getAllProducts()) .thenReturn(Stream.of(new Product(),
		 * new Product(), new Product()).collect(Collectors.toList()));
		 */assertEquals(2, productService.getAllProducts().size());
	}

}
