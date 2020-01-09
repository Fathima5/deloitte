package com.spring.web.dao;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.spring.web.entity.Book;
@Repository
public class BookDAO 
{
	SessionFactory sessionFactory;
	@Autowired
	public BookDAO(SessionFactory sessionFactory) 
	{
		this.sessionFactory=sessionFactory;
	}
	public void insertBook(Book e)
	{
		Session session = sessionFactory.openSession();
		session.save(e);
		session.beginTransaction().commit();
	}
	public void deleteBook(int bookid)
	{
		Session session = sessionFactory.openSession();
		Book e = session.get(Book.class,bookid);
		session.delete(e);
		session.beginTransaction().commit();
	}
	public void modifyBook(Book e)
	{
		Session session = sessionFactory.openSession();
		session.update(e);
		session.beginTransaction().commit();
	}
	public Book getBook(int bookid)
	{
		Session session = sessionFactory.openSession();
		return session.get(Book.class,bookid);
	}
	
}
