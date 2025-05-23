package hu.ultimade.dbrt_challenge.services;

import org.springframework.stereotype.Service;

@Service
public class TextService {

    public Integer getCountOfVowelFromText(String data){
        return data.replaceAll("[^aáeéiíoóuúöőüűAÁEÉIÍOÓUÚÖŐÜŰ]","").length();
    }
}
