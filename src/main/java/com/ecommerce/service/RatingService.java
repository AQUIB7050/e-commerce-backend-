package com.ecommerce.service;

import java.util.List;

import com.ecommerce.exception.ProductException;
import com.ecommerce.model.Rating;
import com.ecommerce.model.User;
import com.ecommerce.requests.RatingRequest;

public interface RatingService {
	
	public Rating createRating(RatingRequest req, User user) throws ProductException;
	
	public List<Rating> ngetProductsRating(Long productId);
}
