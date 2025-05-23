package hu.ultimade.dbrt_challenge.services;

import hu.ultimade.dbrt_challenge.dto.RestResponse;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;

@SpringBootTest
class NumberServiceTest {

    @Autowired
    private NumberService numberService;

    @Test
    void isNumberPrime_TestPrimeNumber() {
        assertInstanceOf(RestResponse.class, numberService.isNumberPrime(BigInteger.valueOf(7)));
        assertEquals("true", ((RestResponse)numberService.isNumberPrime(BigInteger.valueOf(7))).getMsg());
    }

    @Test
    void isNumberPrime_TestNonPrimeNumber() {
        assertInstanceOf(RestResponse.class, numberService.isNumberPrime(BigInteger.valueOf(7)));
        assertEquals("false", ((RestResponse)numberService.isNumberPrime(BigInteger.valueOf(4))).getMsg());
    }
}