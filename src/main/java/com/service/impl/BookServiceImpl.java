package com.service.impl;

import com.controller.Code;
import com.dao.BookDao;
import com.domain.Book;
import com.exception.SystemException;
import com.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookDao bookDao;

    @Override
    public boolean save(Book book) {

        return bookDao.save(book) > 0;
    }

    @Override
    public boolean update(Book book) {

        return bookDao.update(book) > 0;
    }

    @Override
    public boolean delete(Integer id) {

        return bookDao.delete(id) > 0;
    }

    @Override
    public Book getById(Integer id) {

        Book book = bookDao.getById(id);

        return book;
    }

    @Override
    public List<Book> getAll() {
        //将可能出现的异常进行包装，转换成自定义异常
        /*try {
            int i = 1 / 0;
        } catch (ArithmeticException e) {
            throw new SystemException(Code.SYSTEM_ERROR, "服务器访问超时，请重试！", e);
        }*/

        List<Book> books = bookDao.getAll();

        return books;
    }
}
