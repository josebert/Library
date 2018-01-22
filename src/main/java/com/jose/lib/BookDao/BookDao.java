package com.jose.lib.BookDao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;


import com.jose.lib.ModelBook.ModelBook;
@Component
public class BookDao {
	static Map<Long,ModelBook> book=new HashMap<Long, ModelBook>();
	static Map<Long,Map<Long, ModelBook>> books = new HashMap<Long, Map<Long, ModelBook>>();
	
	public BookDao() {
		book.put(1l,new ModelBook(1,"LOTRs the felloshinp of the ring","J.R.R Tolkien",34));
		books.put(1l, book);
		
		book.put(2l,new ModelBook(2,"LOTRs Two Towers","J.R.R Tolkien",34));
		books.put(1l, book);
		
		book.put(3l,new ModelBook(3,"LOTRs Return of the King","J.R.R Tolkien",34));
		books.put(1l, book);
		
		book.put(1l,new ModelBook(1,"Narnia 1","C. S. Lewis",34));
		books.put(2l, book);
		
		book.put(2l,new ModelBook(1,"Narnia 2","C. S. Lewis",34));
		books.put(2l, book);
		
		book.put(2l,new ModelBook(1,"Narnia 3","C. S. Lewis",34));
		books.put(2l, book);
		
		book.put(2l,new ModelBook(1,"Narnia 4","C. S. Lewis",34));
		books.put(2l, book);
		
		book.put(2l,new ModelBook(1,"Narnia 5","C. S. Lewis",34));
		books.put(2l, book);
		
		book.put(2l,new ModelBook(1,"Narnia 6","C. S. Lewis",34));
		books.put(2l, book);
		
	}
	public	Map<Long, Map<Long, ModelBook>> getbooks(){
		
//			Collection<Map<Long, ModelBook>> values = books.values();
////			List<Map<Long,Map<Long, ModelBook>>> array = new ArrayList(values); //This is not working 
//
//			List<Map<Long, ModelBook>> array = new ArrayList<Map<Long, ModelBook>>(values); //but this is working.
		
		Map<Long, Map<Long, ModelBook>> books = new HashMap<Long, Map<Long, ModelBook>>();
		Map<Long, ModelBook> book = new HashMap<Long, ModelBook>();    
		books.put(2l,book);
			return books;
		}


}
