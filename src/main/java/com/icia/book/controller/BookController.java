package com.icia.book.controller;

import com.icia.book.dto.BookDTO;
import com.icia.book.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping("/save")
    public String save(){

        return "bookSave";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute BookDTO bookDTO, Model model){
        boolean result = bookService.save(bookDTO);
        model.addAttribute("result",result);
        if(result){
            return "index";
        }else {
            return "false";
        }
    }

    @GetMapping("/findBook")
    public String findBook(Model model){
        BookDTO findResult = bookService.findBook();
//        책에 대한 정보를 가져오기 위해서 DTO객체 받아오기
        model.addAttribute("book",findResult);
        return "findBook";
    }

    @GetMapping("/books")
    public String findAll(Model model){
        List<BookDTO> bookList= bookService.findAll();
        model.addAttribute("bookList",bookList);
        return "bookList";
    }

    @GetMapping("/book")
    public String book(@RequestParam("bookId") Long bookId, Model model){
        BookDTO result = bookService.book(bookId);
        model.addAttribute("book",result);
        return "findBook";
    }
}
