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
	Map<Long, ModelBook> book = new HashMap<Long, ModelBook>();
	Map<Long, Map<Long, ModelBook>> books = new HashMap<Long, Map<Long, ModelBook>>();
	// ModelBook>>();
	long id = 123;

	public BookDao() {

		ModelBook b = new ModelBook(++id, "LOTRs the felloshinp of the ring", "J.R.R Tolkien", 34);
		book.put(12341l, b);
		books.put(1l, book);

		book.put(12342l, new ModelBook(++id, "LOTRs Two Towers", "J.R.R Tolkien", 34));
		books.put(1l, book);

		book.put(12343l, new ModelBook(++id, "LOTRs Return of the King", "J.R.R Tolkien", 34));
		books.put(1l, book);

		book.put(1241l, new ModelBook(++id, "Narnia 1", "C. S. Lewis", 34));
		books.put(2l, book);

		book.put(1232l, new ModelBook(++id, "Narnia 2", "C. S. Lewis", 34));
		books.put(2l, book);

		book.put(1243l, new ModelBook(++id, "Narnia 3", "C. S. Lewis", 34));
		books.put(2l, book);

		book.put(1244l, new ModelBook(++id, "Narnia 4", "C. S. Lewis", 34));
		books.put(1l, book);

		book.put(1245l, new ModelBook(++id, "Narnia 5", "C. S. Lewis", 34));
		books.put(2l, book);

		book.put(1246l, new ModelBook(++id, "Narnia 6", "C. S. Lewis", 34));
		books.put(2l, book);
	}

	public List<Map<Long, Map<Long, ModelBook>>> getbooks1() {
		List<Map<Long, Map<Long, ModelBook>>> ls = new ArrayList<Map<Long,Map<Long,ModelBook>>>();
		ls.add(books);
		return ls;
	}

	public List<ModelBook> getbooks() {
		Collection<ModelBook> values = book.values();
		List<ModelBook> list = new ArrayList<ModelBook>(values);
		return list;
	}

	public void postbook(ModelBook b) {
		b.setId(++id);

		book.put(b.getId(), b);

	}

	public ModelBook getbook(long id) {

		return book.get(id);
	}

	public void put(ModelBook b) {
		if (book.get(b.getId()) != null) {
			book.put(b.getId(), b);
		}
	}
	// public void delete()

}
