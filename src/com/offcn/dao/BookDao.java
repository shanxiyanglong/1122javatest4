package com.offcn.dao;

import com.offcn.bean.Book;

import java.util.List;

public interface BookDao {
    //查询所有
    List<Book> selectAllBook();
    //通过id查询
    Book selectBookById(int id);
    //修改
    int updateBook(Book book);
}
