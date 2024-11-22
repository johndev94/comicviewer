package com.app.comicviewer.api.controller;

import com.app.comicviewer.api.model.Comic;
import com.app.comicviewer.service.ComicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class ComicController {

    private ComicService comicService;

    @Autowired
    public ComicController(ComicService comicService){
        this.comicService = comicService;
    }

    @GetMapping("/comic")
    public Comic getComic(@RequestParam Integer id){
        Optional<Comic> comic = comicService.getComic(id);
        if(comic.isPresent()){
            return(Comic) comic.get();
        }
        return null;
    }
}
