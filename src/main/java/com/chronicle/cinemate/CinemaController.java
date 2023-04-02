package com.chronicle.cinemate;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/cinemas")
public class CinemaController {

    @Autowired
    private CinemaService cinemaService;
    @GetMapping
    public ResponseEntity<List<Cinema>> getAllCinema()
    {
        return new ResponseEntity<>(cinemaService.allCinema(), HttpStatus.OK);
    }

    @GetMapping("/{imdbid}")
    public ResponseEntity<Optional<Cinema>> getSingleCinema(@PathVariable String imdbid)
    {
        return new ResponseEntity<>(cinemaService.getCinemaByImdbId(imdbid), HttpStatus.OK);
    }
}
