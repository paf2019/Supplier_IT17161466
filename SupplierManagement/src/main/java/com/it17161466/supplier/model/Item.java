package com.it17161466.supplier.model;

//import java.util.Set;

//import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.JoinTable;
//import javax.persistence.ManyToMany;
import javax.persistence.Table;
//import javax.validation.constraints.NotEmpty;

import lombok.Data;

@Data
@Entity
@Table(name = "item")
public class Item {

	 @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    @Column(name = "item_id")
	    private int id;
	    
	    @Column(name = "item_name")
	    private String item_name;
	    
	    @Column(name = "item_price")
	    private Double item_price;
	    
	    @Column(name = "item_weight")
	    private Double item_weight;
	    
	   /* @ManyToMany(cascade = CascadeType.ALL)
	    @JoinTable(name = "item_supply", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "item_id"))
	    private Set<User> item_supplier;*/
}
