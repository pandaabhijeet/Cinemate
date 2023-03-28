package com.chronicle.cinemate;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/cinemas")
public class CinemaController {

    @GetMapping
    public ResponseEntity<String> getAllCinema()
    {
        return new ResponseEntity<String>("All Movies !", HttpStatus.OK);
    }
}
