package com.jose.lib.Controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jose.lib.BookDao.BookDao;
import com.jose.lib.ModelBook.ModelBook;

@RestController
@RequestMapping("/Book")
public class Controller {
	
	@Autowired
	BookDao b;
	
	@GetMapping("/books")
	Map<Long, Map<Long, ModelBook>> getList(){
		return b.getbooks();
	}
	
	
	
}
