package hu.ultimade.dbrt_challenge.controllers.rest;

import hu.ultimade.dbrt_challenge.services.TextService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TextRestController {

    @Autowired
    private TextService textService;

    @GetMapping("/maganhangzo{SZOVEG}")
    public Object getCountOfVowelFromText(@RequestParam("SZOVEG") String data){

        return textService.getCountOfVowelFromText(data);
    }
}
