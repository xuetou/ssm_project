package com.skynj.ssm.service.impl;

import com.skynj.ssm.dao.BookDao;
import com.skynj.ssm.pojo.Book;
import com.skynj.ssm.service.BookService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
public class BookServiceImpl implements BookService {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    // 注入Service依赖
    @Autowired
    private BookDao bookDao;


    @Override
    public Book getById(long bookId) {
        return bookDao.queryById(bookId);
    }

    @Override
    public List<Book> getList() {
        return bookDao.queryAll();
    }
}

