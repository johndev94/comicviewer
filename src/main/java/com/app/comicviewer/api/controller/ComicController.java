package com.app.comicviewer.api.controller;

import com.app.comicviewer.service.ComicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
        model.addAttribute("genres", comicService.findAllGenres());
        return "comics";
    }

    @GetMapping("/search")
    public String searchComics(@RequestParam("query") String query, Model model) {
        model.addAttribute("comics", comicService.searchComicsByTitle(query));
        model.addAttribute("genres", comicService.findAllGenres());
        return "comics";
    }

    @GetMapping("/genre")
    public String filterComicsByGenre(@RequestParam("genre") String genre, Model model) {
        model.addAttribute("comics", comicService.findComicsByGenre(genre));
        model.addAttribute("genres", comicService.findAllGenres());
        return "comics";
    }
    }
