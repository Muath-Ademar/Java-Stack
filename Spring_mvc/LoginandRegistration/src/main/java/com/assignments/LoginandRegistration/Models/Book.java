package com.assignments.LoginandRegistration.Models;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name="books")
public class Book {

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;
		@NotNull
		@Size(min = 3, max = 40)
		private String title;
		@NotNull
		@Size(min = 3, max = 40)
		private String author;
		@NotNull
		@Column(columnDefinition = "Text")
		private String mythoughts;
		
		@Column(updatable = false)
		private Date createdAt;
		private Date updatedAt;
		
		 @ManyToOne(fetch = FetchType.LAZY)
		 @JoinColumn(name="user_id")
	    private User user;

		public Book() {
			
		}

		public Book(Long id, String title,
				 String author,  String mythoughts, Date createdAt,
				Date updatedAt, User user) {
			
			this.id = id;
			this.title = title;
			this.author = author;
			this.mythoughts = mythoughts;
			this.createdAt = createdAt;
			this.updatedAt = updatedAt;
			this.user = user;
		}

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public String getAuthor() {
			return author;
		}

		public void setAuthor(String author) {
			this.author = author;
		}

		public String getMythoughts() {
			return mythoughts;
		}

		public void setMythoughts(String mythoughts) {
			this.mythoughts = mythoughts;
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

		public User getUser() {
			return user;
		}

		public void setUser(User user) {
			this.user = user;
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
		






