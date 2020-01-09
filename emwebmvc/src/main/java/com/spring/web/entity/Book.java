package com.spring.web.entity;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Book 
{
		@Id
		int bookid;
		String title;
		double price;
		String author;
		public Book() {}
		public Book(int bookid, String title, double price, String author) 
		{
		
			this.bookid = bookid;
			this.title = title;
			this.price = price;
			this.author = author;
		}
		public int getBookid() {
			return bookid;
		}
		public void setBookid(int bookid) {
			this.bookid = bookid;
		}
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public double getPrice() {
			return price;
		}
		public void setPrice(double price) {
			this.price = price;
		}
		public String getAuthor() {
			return author;
		}
		public void setAuthor(String author) {
			this.author = author;
		}
		
}