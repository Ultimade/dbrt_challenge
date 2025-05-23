package hu.ultimade.dbrt_challenge.controllers.rest;

import hu.ultimade.dbrt_challenge.services.DateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
public class DeteRestController {

    @Autowired
    private DateService dateService;


    @GetMapping("/melyiknap{DATUM}")
    public Object getDayOfTheWeek(@RequestParam("DATUM") LocalDate date){

        return dateService.getDayOfTheWeek(date);
    }
}
