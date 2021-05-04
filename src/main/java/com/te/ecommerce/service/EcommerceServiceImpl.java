package com.te.ecommerce.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.te.ecommerce.bean.Admin;
import com.te.ecommerce.bean.Item;

@Service
public class EcommerceServiceImpl implements EcommerceService{

	@Autowired
	EcommerceServiceImpl ecommerceServiceImpl;
	
	@Override
	public Admin authenticate(Integer id, String password) {
		
		Admin admin = ecommerceServiceImpl.authenticate(id, password);
		return admin;
	}

	@Override
	public boolean addItem(Item item) {
		boolean result = ecommerceServiceImpl.addItem(item) ;
		return result;
	}

	@Override
	public boolean removeItem(Integer id) {
		boolean result = ecommerceServiceImpl.removeItem(id);
		return result;
	}

	@Override
	public Item searchItem(Integer id) {
		Item item = ecommerceServiceImpl.searchItem(id);
		return item;
	}

	@Override
	public List<Item> getAllItems() {
		List<Item> list = ecommerceServiceImpl.getAllItems();
		return list;
	}

	@Override
	public boolean updateItem(Item item) {
		boolean result = ecommerceServiceImpl.updateItem(item);
		return result;
	}

}
