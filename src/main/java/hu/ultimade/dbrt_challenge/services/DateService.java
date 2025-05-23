package hu.ultimade.dbrt_challenge.services;

import hu.ultimade.dbrt_challenge.dto.ErrorRestResponse;
import hu.ultimade.dbrt_challenge.dto.RestResponse;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

@Service
public class DateService {
    public Object getDayOfTheWeek(LocalDate date) {

        try{
            String day = date.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.forLanguageTag("hu"));
            return new RestResponse(day, "OK");
        }catch (Exception ex){
            return new ErrorRestResponse("Wrong data loaded!",  "NOK", ex.getMessage());
        }
    }
}
