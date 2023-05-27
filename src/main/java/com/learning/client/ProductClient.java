package com.learning.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.learning.shared.Product;

@FeignClient(value = "product-client", url = "http://localhost:9090/product")
public interface ProductClient {

	@GetMapping("/{id}")
	public Product findById(@PathVariable Long id);
}
