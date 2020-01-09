package com.spring.web.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import com.spring.web.dao.BookDAO;
import com.spring.web.entity.Book;
@Controller
public class BookController 
{
	BookDAO edao;
	
	@Autowired
	BookController(BookDAO edao)
	{
		this.edao=edao;
	}
	@GetMapping("/bookPage")
	public String getBookpage(Model model)
	{
		model.addAttribute("book",new Book(0,"",0.0,""));
		return "DisplayBook";
	}
	@GetMapping("/bookCRUD")
	public String bookCrud(@RequestParam("sub")String sub,@RequestParam("bookid")int bookid,@RequestParam("title")String title,@RequestParam("price")double price,@RequestParam("author")String author,RedirectAttributes ra)
	{
		ra.addFlashAttribute("book",new Book(bookid,title,price,author));
		String val="";
		if(sub.equals("Add_Book"))  val="addBook";
		else if(sub.equals("Del_Book")) val="deleteBook";
		else if(sub.equals("Mod_Book")) val="modifyBook";
		else val="getBook";
		return "redirect:"+val;
		}
	@GetMapping("/addBook")
	public String addBook(@ModelAttribute("book")Book e)
	{
		edao.insertBook(e);
		return "DisplayBook";
	}
	@GetMapping("/modifyBook")
	public String modifyBook(@ModelAttribute("book")Book e)
	{
		edao.modifyBook(e);
		return "DisplayBook";
	}
	@GetMapping("/deleteBook")
	public String deleteBook(@ModelAttribute("book")Book e)
	{
		edao.deleteBook(e.getBookid());
		return "DisplayBook";
	}
	@GetMapping("/getBook")
	public String getBook(@ModelAttribute("book")Book e,Model model)
	{
		Book e1 = edao.getBook(e.getBookid());
		model.addAttribute("book",e1);
		return "DisplayBook";
	}
}
