package com.niit.myridebackend.daoimpl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.niit.myridebackend.dao.ShippingAddressDao;
import com.niit.myridebackend.model.ShippingAddress;

@Repository
@EnableTransactionManagement
@Transactional
public class ShippingAddressDaoImpl implements ShippingAddressDao {

	@Autowired
	SessionFactory sessionFactory;
	
	@Transactional
	public void add(ShippingAddress shippingAddress) {
		sessionFactory.getCurrentSession().saveOrUpdate(shippingAddress);
	}

	@Transactional
	public void update(ShippingAddress shippingAddress) {
		sessionFactory.getCurrentSession().update(shippingAddress);
	}

}
