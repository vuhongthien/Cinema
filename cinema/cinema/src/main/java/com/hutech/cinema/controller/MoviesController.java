package com.hutech.cinema.controller;

import com.hutech.cinema.entity.Movies;
import com.hutech.cinema.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@RestController

public class MoviesController  {
    @Autowired
    private MovieService movieService;

    @PostMapping()
    public ResponseEntity<String> saveVideo(@RequestParam("file") MultipartFile file, @RequestParam("name") String name) throws IOException {

        movieService.saveVideo(file, name);
        return ResponseEntity.ok("Video saved successfully.");

    }

    // {name} is a path variable in the url. It is extracted as the String parameter annotated with @PathVariable
    @GetMapping("/{name}")
    public ResponseEntity<Resource> getVideoByName(@PathVariable("name") String name){

        return ResponseEntity
                .status(HttpStatus.OK)
                .contentType(MediaType.APPLICATION_OCTET_STREAM)
                .body(new ByteArrayResource(movieService.getMovice(name).getData()));

    }

    @GetMapping("/all")
    public ResponseEntity<?> getAllVideoNames(){

        return ResponseEntity
                .ok(movieService.getAllVideoNames());

    }


}
