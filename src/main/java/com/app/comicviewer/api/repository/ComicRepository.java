package com.app.comicviewer.api.repository;

import com.app.comicviewer.api.model.Comic;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ComicRepository extends JpaRepository<Comic, Integer> {

    //search by title
    @Query("SELECT c From Comic c WHERE c.title LIKE %:query%")
    List<Comic> searchComicsByTitle(@Param("query") String query);

    //filter by genre
    @Query("SELECT c From Comic c WHERE c.genre LIKE %:genre%")
    List<Comic> filterByGenre(String genre);

    @Query("SELECT DISTINCT c.genre FROM Comic c")
    List<String> findAllGenres();
}
