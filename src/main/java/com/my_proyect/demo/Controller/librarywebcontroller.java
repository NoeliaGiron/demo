package com.my_proyect.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.my_proyect.demo.service.BookService;
@Controller
@RequestMapping("/library")
public class librarywebcontroller {
    @Autowired
	BookService bookService;
	
	@RequestMapping("/books")
	public String getWeb(Model containerToView ){
		
		containerToView.addAttribute("books", bookService.getAllBooks());
		containerToView.addAttribute("Name", "http://library");
		containerToView.addAttribute("Direccion", "Ecuador");
		
		return "showBooks";
		
	}
}
