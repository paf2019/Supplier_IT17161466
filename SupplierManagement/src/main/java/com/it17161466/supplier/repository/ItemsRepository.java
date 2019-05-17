package com.it17161466.supplier.repository;

import org.springframework.data.repository.CrudRepository;

import com.it17161466.supplier.model.Item;

public interface ItemsRepository extends CrudRepository<Item, Integer> {

}
