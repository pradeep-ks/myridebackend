package com.niit.myridebackend.dao;

import com.niit.myridebackend.model.ShippingAddress;

public interface ShippingAddressDao {

	void add(ShippingAddress shippingAddress);
	
	void update(ShippingAddress shippingAddress);
	
	//ShippingAddress getByUserId(int userId);
}
