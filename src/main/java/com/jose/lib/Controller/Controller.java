package com.jose.lib.Controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jose.lib.BookDao.BookDao;
import com.jose.lib.ModelBook.ModelBook;

@RestController
@RequestMapping("/Book")
public class Controller {
	
	@Autowired
	BookDao bookdao;
	
//	@GetMapping("/books")
//	List<Map<Long, ModelBook>>getList(){
//		return b.getbooks();
//	}
//	
	@GetMapping("/books")
	List<ModelBook>getBooks(){
		return bookdao.getbooks();
	}
	
	@GetMapping("/book/{id}")
	ModelBook mbook(@PathVariable("id") long id) {
		return bookdao.getbook(id);
	}
	
	@PostMapping("/book")
	boolean postbook(@RequestBody ModelBook b) {
		bookdao.postbook(b);
		return true;
	}
	
	@PutMapping("/book/{id}")
	void putbook(ModelBook b) {
		
	}
		
	
	
	@GetMapping("/book")
	List<Map<Long, Map<Long, ModelBook>>> allBooks() {
		return bookdao.getbooks1();
	}
	
}
