package com.productapp.model.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.productapp.model.entities.Product;
import com.productapp.model.repo.ProductRepository;

@Service
@Transactional
public class ProductServiceImpl implements ProductService {
	@Autowired
	private ProductRepository productRepository;

	@Override
	public List<Product> getAllProducts() {

		return (List<Product>) productRepository.findAll();
	}

	@Override
	public Product findProductByName(String productName) {
		Product product = productRepository.findByName(productName);
		return product;
	}

	@Override
	public Product BuyProductByName(String name) {
		Product product=productRepository.BuyProductByName(name);
		return product;
	}

	/*@Override
	public Product BuyProductById(Long id) {
	Product product=productRepository.BuyProductById(id);
		return product;
	}*/

	/*
	 * @Override public Product findByProductName(String productName) { Product
	 * product=productRepository.findByProductName(productName); return product;
	 * }
	 */
}
