package com.jose.lib.ModelBook;



public class ModelBook {
	private long id;
	private String book;
	private String author;
//	private Date yop;
	private int stock;
	public ModelBook(){	
		
//		new BookDao();
	}
	
	public ModelBook(long id, String book,String author,int stock){
		this.id=id;
		this.book=book;
		this.author=author;
		this.stock=stock;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getBook() {
		return book;
	}

	public void setBook(String book) {
		this.book = book;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

//	public Date getYop() {
//		return yop;
//	}
//
//	public void setYop(Date yop) {
//		this.yop = yop;
//	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

}