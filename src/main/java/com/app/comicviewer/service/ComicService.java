package com.app.comicviewer.service;

import com.app.comicviewer.api.model.Comic;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ComicService {

    private List<Comic> comicList;

    public ComicService(){
        this.comicList = new ArrayList<>();
        comicList.add(new Comic(1, "The Adventures of AI", "Sci-Fi", "John Doe", "https://example.com/comic1.jpg", "2024-11-19", 4.5));
        comicList.add(new Comic(2, "Mysteries of the Universe", "Mystery", "Jane Smith", "https://example.com/comic2.jpg", "2023-08-12", 4.0));
        comicList.add(new Comic(3, "Heroic Tales", "Action", "Alice Johnson", "https://example.com/comic3.jpg", "2022-05-23", 4.8));
        comicList.add(new Comic(4, "Fantasy World", "Fantasy", "Robert Brown", "https://example.com/comic4.jpg", "2021-03-15", 4.2));
        comicList.add(new Comic(5, "The Future Chronicles", "Sci-Fi", "Emily Davis", "https://example.com/comic5.jpg", "2020-11-05", 4.9));
    }

    public Optional<Comic> getComic(Integer id) {

        Optional<Comic> optional = Optional.empty();

        for(Comic comic : comicList) {
            if(id.equals(comic.getId())){
                optional = Optional.of(comic);
                return optional;
            }
        }
        return optional;
    }
    public List<Comic> findAll() {
        return new ArrayList<>(comicList);

    }
}
