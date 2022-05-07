package com.offcn.service;

import com.offcn.bean.Book;
import com.offcn.dao.BookDao;
import com.offcn.dao.BookDaoImpl;

import java.util.List;

public class BookServiceImpl implements BookService {
    BookDao bk = new BookDaoImpl();
    @Override
    public List<Book> selectAllBook() {
        return bk.selectAllBook();
    }

    @Override
    public Book selectBookById(int id) {
        return bk.selectBookById(id);
    }

    @Override
    public int updateBook(Book book) {
        return bk.updateBook(book);
    }
}
