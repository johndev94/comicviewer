package com.app.comicviewer.api.controller;

import com.app.comicviewer.service.ComicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/comics")
public class ComicController {

    private final ComicService comicService;

    @Autowired
    public ComicController(ComicService comicService) {
        this.comicService = comicService;
    }

    @GetMapping
    public String getComicsPage(Model model) {
        model.addAttribute("comics", comicService.findAll());
        return "comics"; // Name of the Thymeleaf template
    }
}
