package com.offcn.dao;

import com.offcn.bean.Book;
import com.offcn.utils.DataSourceUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.List;

public class BookDaoImpl implements BookDao {
    QueryRunner qr = new QueryRunner(DataSourceUtils.getDataSource());
    @Override
    public List<Book> selectAllBook() {
        List<Book> list = null;
        String sql = "SELECT * FROM book";
        try {
            list = qr.query(sql,new BeanListHandler<>(Book.class));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public Book selectBookById(int id) {
        Book book = new Book();
        String sql = "SELECT * FROM book WHERE id = ?";
        try {
            book = qr.query(sql,new BeanHandler<>(Book.class),id);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return book;
    }

    @Override
    public int updateBook(Book book) {
        int result = 0;
        String sql = "UPDATE book SET bookName = ?,author = ? WHERE id = ?";
        try {
            result =  qr.update(sql,new Object[]{book.getBookName(),book.getAuthor(),book.getId()});
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }
}
