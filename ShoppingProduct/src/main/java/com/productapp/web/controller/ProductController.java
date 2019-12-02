package com.productapp.web.controller;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.Resource;
import org.springframework.hateoas.mvc.ControllerLinkBuilder;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.productapp.model.entities.Product;
import com.productapp.model.entities.ProductFeatures;
import com.productapp.model.service.ProductFeatureService;
import com.productapp.model.service.ProductService;

@RestController
public class ProductController {
	@Autowired
	private ProductService productService;

	@Autowired
	private ProductFeatureService productFeatureService;

	@GetMapping(path = "product")
	public List<Product> getAllProducts() {
		List<Product> products = productService.getAllProducts();
		return products;
	}

	@GetMapping(path = "product/{productName}")
	public Product getProductByName(@PathVariable(value = "productName") String productName) {
		Product product = productService.findProductByName(productName);
		return product;
	}

	@PostMapping(path = "product/{productName}/{storeid}")
	public ResponseEntity<Product> buyProduct(@PathVariable(name="productName")String name,@PathVariable(name = "storeid") Long id, @RequestBody Product product
			) {
		return new ResponseEntity<Product>(productService.BuyProductByName(name), HttpStatus.OK);
	}

	/*
	 * @GetMapping(path = "productFeature/{productName}") public ProductFeatures
	 * getProductFeatureByName(@PathVariable(name = "productName") String
	 * productName) { ProductFeatures product =
	 * productFeatureService.findByName(productName); return product;
	 * 
	 * }
	 */

	/*
	 * @PostMapping(path = "product/{productId}/{storeId}") public Product
	 * BuyProductById(@PathVariable(value = "productName") String productName) {
	 * Product product = productService. return product; }
	 */
}
