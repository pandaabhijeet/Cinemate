package com.chronicle.cinemate;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CinemaService {

    @Autowired
    private CinemaRepository cinemaRepository;

    public List<Cinema> allCinema()
    {
        return cinemaRepository.findAll();
    }

    public Optional<Cinema> getCinemaByImdbId(String imdbid)
    {
        return cinemaRepository.findCinemaByImdbId(imdbid);
    }
}
