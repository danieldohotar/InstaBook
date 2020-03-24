package com.instabook.mvc;

import com.instabook.domain.Book;
import com.instabook.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/")
public class AppController {

    @Autowired
    private BookService service;

    @RequestMapping("/")
    public String viewBooks(Model model){
        List<Book> listBooks = service.listAll();
        model.addAttribute("listBooks", listBooks);
        return "index";
    }

    @RequestMapping("/new")
    public String addBook(Model model){
        Book book = new Book();
        model.addAttribute("book", book);
        return "new_book";
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String saveBook(@ModelAttribute("book") Book book){
        service.save(book);

        return "redirect:/";
    }

    @RequestMapping("/edit/{id}")
    public ModelAndView editBook(@PathVariable(name = "id")Long id){
        ModelAndView obj = new ModelAndView("edit");
        Book book = service.get(id);
        obj.addObject("book", book);

        return obj;
    }

    @RequestMapping("/delete/{id}")
    public String deleteBook(@PathVariable(name = "id")Long id){
        service.delete(id);

        return"redirect:/";
    }
}
