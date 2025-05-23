package hu.ultimade.dbrt_challenge.services;

import hu.ultimade.dbrt_challenge.dto.ErrorRestResponse;
import hu.ultimade.dbrt_challenge.dto.RestResponse;
import org.springframework.stereotype.Service;

@Service
public class TextService {

    public Object getCountOfVowelFromText(String data){

        try{
            int vowelCount = data.replaceAll("[^aáeéiíoóuúöőüűAÁEÉIÍOÓUÚÖŐÜŰ]","").length();
            return new RestResponse(String.valueOf(vowelCount), "OK");
        }catch (Exception ex){
            return new ErrorRestResponse("Wrong data loaded!",  "NOK", ex.getMessage());
        }
    }
}
