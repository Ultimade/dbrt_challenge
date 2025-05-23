package hu.ultimade.dbrt_challenge.controllers.rest;

import hu.ultimade.dbrt_challenge.services.NumberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigInteger;

@RestController
public class NumberRestController {

    @Autowired
    private NumberService numberService;


    @GetMapping("/primszam{SZAM}")
    public boolean isNumberPrime(@RequestParam("SZAM") BigInteger number){

        return numberService.isNumberPrime(number);
    }
}
