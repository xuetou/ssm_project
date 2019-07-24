package com.skynj.ssm.controller;

import java.util.List;

import com.skynj.ssm.pojo.Book;
import com.skynj.ssm.service.BookService;
import org.apache.ibatis.annotations.Param;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping("/book")
public class BookController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private BookService bookService;

    @RequestMapping(value = "/list", method = RequestMethod.GET)

    private String list(Model model) {
//        List<Book> list = bookService.getList();
//        model.addAttribute("list", list);
        Book book = bookService.getById(1000);
        model.addAttribute("book",book);
        return "list";
    }
}

