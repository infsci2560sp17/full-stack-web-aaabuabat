package edu.infsci2560.services;

import edu.infsci2560.models.iRestaurant;
import edu.infsci2560.models.iRestaurant.CuisineType;
import edu.infsci2560.repositories.iRestaurantRepository;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author aaabuabat
 */
@RestController
@RequestMapping("/public/api/iRestaurant")

public class iRestaurantService {
    @Autowired
    private iRestaurantRepository repository;

    @RequestMapping(method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<Iterable<iRestaurant>> list() {
        HttpHeaders headers = new HttpHeaders();
        return new ResponseEntity<>(repository.findAll(), headers, HttpStatus.OK);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<iRestaurant> list(@PathVariable("id") Long id) {
        HttpHeaders headers = new HttpHeaders();
        return new ResponseEntity<>(repository.findOne(id), headers, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.POST, consumes="application/json", produces = "application/json")
    public ResponseEntity<iRestaurant> create(@RequestBody iRestaurant iRestaurant) {
        HttpHeaders headers = new HttpHeaders();
        return new ResponseEntity<>(repository.save(iRestaurant), headers, HttpStatus.OK);
    }
}
