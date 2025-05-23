package hu.ultimade.dbrt_challenge.services;

import hu.ultimade.dbrt_challenge.dto.ErrorRestResponse;
import hu.ultimade.dbrt_challenge.dto.RestResponse;
import org.springframework.stereotype.Service;

import java.math.BigInteger;

@Service
public class NumberService {
    public Object isNumberPrime(BigInteger number) {

        try{
            boolean isPrime = number.isProbablePrime(1);
            return new RestResponse(String.valueOf(isPrime), "OK");
        }catch (Exception ex){
            return new ErrorRestResponse("Wrong data loaded!",  "NOK", ex.getMessage());
        }
    }
}
