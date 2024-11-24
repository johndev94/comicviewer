package com.app.comicviewer.api.controller;

import com.app.comicviewer.api.model.Comic;
import com.app.comicviewer.service.ComicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

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
        // Add attributes to the model to be displayed on the Thymeleaf template
        model.addAttribute("comics", comicService.findAll());
        return "comics"; // Name of the Thymeleaf template
    }
}
