package com.hutech.cinema.service.imple;

import com.hutech.cinema.entity.Movies;
import com.hutech.cinema.repository.MovieRepository;
import com.hutech.cinema.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;
@Service
public class MoviesImp implements MovieService {

    @Autowired
    private MovieRepository movieRepository;

    @Override
    public Movies getMovice(String nameMovice) {
        return movieRepository.findByNameMovie(nameMovice);
    }

    @Override
    public Movies saveVideo(MultipartFile file, String name) throws IOException {
        Movies newVid = new Movies(name, file);
        return movieRepository.save(newVid);
    }

    @Override
    public List<Movies> getAllVideoNames() {
        return movieRepository.findAll();
    }
}
