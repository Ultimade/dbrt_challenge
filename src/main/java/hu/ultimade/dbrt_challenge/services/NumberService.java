package hu.ultimade.dbrt_challenge.services;

import org.springframework.stereotype.Service;

import java.math.BigInteger;

@Service
public class NumberService {
    public boolean isNumberPrime(BigInteger number) {
        return number.isProbablePrime(1);
    }
}
