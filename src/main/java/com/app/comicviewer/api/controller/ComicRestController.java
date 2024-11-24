package com.app.comicviewer.api.controller;

import com.app.comicviewer.api.model.Comic;
import com.app.comicviewer.service.ComicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/comics")
public class ComicRestController {

    private final ComicService comicService;

    @Autowired
    public ComicRestController(ComicService comicService) {
        this.comicService = comicService;
    }

    @GetMapping("/comic")
    public Comic getComic(@RequestParam Integer id) {
        Optional<Comic> comic = comicService.getComic(id);
        return comic.orElse(null);
    }

    @GetMapping("/all")
    public List<Comic> findAll() {
        return comicService.findAll();
    }
}
