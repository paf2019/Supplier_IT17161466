package com.it17161466.supplier.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.it17161466.supplier.model.Item;
import com.it17161466.supplier.repository.ItemsRepository;


@Service
public class ItemsManagementService {

	@Autowired
	private ItemsRepository itemsRepository;

	public Item createItem(Item item) {
		
		return itemsRepository.save(item);
	}

	public Optional<Item> getItemById(Integer itemId) {
		return itemsRepository.findById(itemId);
	}
}
