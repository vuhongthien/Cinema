package com.hutech.cinema.service;

import com.hutech.cinema.entity.Movies;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

public interface MovieService {

    Movies getMovice(String nameMovice);

    Movies saveVideo(MultipartFile file, String name) throws IOException;
    List<Movies> getAllVideoNames();
}
