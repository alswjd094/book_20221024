package com.icia.book.controller;

import com.icia.book.dto.BookDTO;
import com.icia.book.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

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
            return "saveResult";
        }else {
            return "false";
        }

    }
}
