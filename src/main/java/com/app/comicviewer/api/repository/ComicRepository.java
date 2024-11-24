package com.app.comicviewer.api.repository;

import com.app.comicviewer.api.model.Comic;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ComicRepository extends JpaRepository<Comic, Integer> {

}
