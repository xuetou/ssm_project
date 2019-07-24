package com.skynj.ssm.dao;

import com.skynj.ssm.pojo.Book;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BookDao {

    /**
     * 通过ID查询单本图书
     *
     * @param id
     * @return
     */
    Book queryById(long id);

    /**
     * 查询所有图书
     * @return
     */
    List<Book> queryAll();

}

