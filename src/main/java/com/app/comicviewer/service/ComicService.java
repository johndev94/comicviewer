package com.app.comicviewer.service;

import com.app.comicviewer.api.model.Comic;
import com.app.comicviewer.api.repository.ComicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ComicService {

    private final ComicRepository comicRepository;

    @Autowired
    public ComicService(ComicRepository comicRepository) {
        this.comicRepository = comicRepository;
    }

    public Optional<Comic> getComic(Integer id) {
        return comicRepository.findById(id);
    }

    public List<Comic> findAll() {
        return comicRepository.findAll();
    }

    public Comic saveComic(Comic comic) {
        return comicRepository.save(comic);
    }
}
