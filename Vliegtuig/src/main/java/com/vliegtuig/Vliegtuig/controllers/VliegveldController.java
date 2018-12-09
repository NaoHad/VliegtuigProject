package com.vliegtuig.Vliegtuig.controllers;

import com.vliegtuig.Vliegtuig.models.Vliegtuig;
import com.vliegtuig.Vliegtuig.repositories.VliegtuigRepository;
import com.vliegtuig.Vliegtuig.repositories.VliegveldRepository;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("vliegveld")
public class VliegveldController {

    //@Autowired
    VliegveldRepository vliegveldRepository;

    public VliegveldController(VliegveldRepository vliegveldRepository){
        this.vliegveldRepository=vliegveldRepository;
    }

    //public MovieController(movieRepository movieRepository){
    //    this.movieRepository = movieRepository;
    //}
    @RequestMapping(value = "{id}/vliegtuigList", method = RequestMethod.POST)
    public void create(@RequestBody Vliegtuig vliegtuig,long id)
    {
       this.vliegveldRepository.getOne(id);

    }


    //@RequestMapping(value = "", method = RequestMethod.POST)
    //public void create(@RequestBody Movie movie)
   // {
    //    this.movieRepository.save(movie);
    //}






}



/*


package nl.capgemini.academy.movie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("api/movie")
public class MovieController {
    //@Autowired
    movieRepository movieRepository;

    public MovieController(movieRepository movieRepository){
        this.movieRepository = movieRepository;
    }

    @RequestMapping(value = "all", method = RequestMethod.GET)
    public Iterable<Movie> getAll() {
        return this.movieRepository.findAll();
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    public void create(@RequestBody Movie movie)
    {
        this.movieRepository.save(movie);
    }

    @RequestMapping(value = "delete/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable long id)
    {
        //Optional<Movie> movie = this.movieRepository.findById(id);

            this.movieRepository.deleteById(id);

    }

    @RequestMapping(value = "watched/{id}", method = RequestMethod.PUT)
    public void toggleWatched(@PathVariable long id){
        //this.movieRepository.getOne(id).setWatched();
        Movie movie = this.movieRepository.getOne(id);
        boolean watch = movie.isWatched();
        watch = !watch;
        movie.setWatched(watch);

        this.movieRepository.save(movie);


        //this.movieRepository.findById(id).

    }

}




 */