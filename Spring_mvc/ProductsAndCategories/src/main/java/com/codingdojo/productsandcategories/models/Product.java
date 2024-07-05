package com.codingdojo.productsandcategories.models;

import java.util.Date;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table
public class Product {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
@NotNull
@Size(min=3, max=40)
private String name;
@NotNull
@Column(columnDefinition = "Text")
private String description;
@NotNull
private Float price;
@Column(updatable = false)
private Date createdAt;
private Date updatedAt;
@ManyToMany(fetch = FetchType.LAZY)
@JoinTable(
name = "categories_products", 
joinColumns = @JoinColumn(name = "product_id"), 
inverseJoinColumns = @JoinColumn(name = "category_id")
    )
private List<Category> categories;
public List<Category> getCategories() {
	return categories;
}
public void setCategories(List<Category> categories) {
	this.categories = categories;
}
public Product() {
	
}
public Product(Long id,  String name,  String description,
		 Float price, Date createdAt, Date updatedAt) {

	this.id = id;
	this.name = name;
	this.description = description;
	this.price = price;
	this.createdAt = createdAt;
	this.updatedAt = updatedAt;
}
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public Float getPrice() {
	return price;
}
public void setPrice(Float price) {
	this.price = price;
}
public Date getCreatedAt() {
	return createdAt;
}
public void setCreatedAt(Date createdAt) {
	this.createdAt = createdAt;
}
public Date getUpdatedAt() {
	return updatedAt;
}
public void setUpdatedAt(Date updatedAt) {
	this.updatedAt = updatedAt;
}


@PrePersist
protected void onCreate(){
    this.createdAt = new Date();
}
@PreUpdate
protected void onUpdate(){
    this.updatedAt = new Date();
}


}
