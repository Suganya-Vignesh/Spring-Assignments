package com.productapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.productapp.model.ProductDto;
import com.productapp.service.IProductService;

@SpringBootApplication
public class SpringProductappJpaApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringProductappJpaApplication.class, args);
	}
	
	
	@Autowired
	private IProductService productService;

	@Override
	public void run(String... args) throws Exception {
		//create
		ProductDto productDto = new ProductDto("mobile", null, 20000, "electronics", "samsung");
		//insert
		productService.addProduct(productDto);
		
		ProductDto nproductDto = productService.getById(1);
		System.out.println(nproductDto);
		
		//update- call setter methods
		nproductDto.setPrice(30000);
		productService.updateProduct(nproductDto);
	}

}
