package com.productapp.service;

import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.productapp.model.Product;
import com.productapp.model.ProductDto;
import com.productapp.repository.IProductRepository;

@Service
public class ProductServiceImpl implements IProductService {

	//autowire the mapper to convert dto to entity and entity back to dto
	@Autowired
	private ModelMapper mapper;
	
	//autowire repo
	private IProductRepository productRepository;
	
	public ProductServiceImpl(IProductRepository productRepository) {
		super();
		this.productRepository = productRepository;
	}

	@Override
	public void addProduct(ProductDto productDto) {
		//convert Dto into entity
		Product product = mapper.map(productDto,Product.class);
		//save the entity
		//while saving, it will check if id is present,if no autogenerate the id create new row
		//if yes, check if id is in db. if no, create a new row, if yes update the row
		productRepository.save(product);
		
	}

	@Override
	public void updateProduct(ProductDto productDto) {
		Product product = mapper.map(productDto, Product.class);
		//product should have id in it
		productRepository.save(product);
	}

	@Override
	public void deleteProduct(int productId) {
		productRepository.deleteById(productId);
	}

	@Override
	public ProductDto getById(int productId) {
		Optional<Product> productOpt = productRepository.findById(productId);
		if(productOpt.isPresent()) {
			Product product = productOpt.get();
			ProductDto productDto = mapper.map(product, ProductDto.class);
			return productDto;
			}
		return null;
	}

	@Override
	public List<ProductDto> getAll() {
		
		return null;
	}

}
