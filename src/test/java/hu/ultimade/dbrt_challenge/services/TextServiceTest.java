package hu.ultimade.dbrt_challenge.services;

import hu.ultimade.dbrt_challenge.dto.ErrorRestResponse;
import hu.ultimade.dbrt_challenge.dto.RestResponse;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;

@SpringBootTest
class TextServiceTest {

    @Autowired
    private TextService textService;

    @Test
    void getCountOfVowelFromText_ValidTextInserted() {
        assertInstanceOf(RestResponse.class, textService.getCountOfVowelFromText("Kettő"));
        assertEquals("2", ((RestResponse) textService.getCountOfVowelFromText("Kettő")).getMsg());
    }
    @Test
    void getCountOfVowelFromText_Null() {
        assertInstanceOf(ErrorRestResponse.class, textService.getCountOfVowelFromText(null));
        assertEquals("NOK", ((ErrorRestResponse) textService.getCountOfVowelFromText(null)).getType());
    }
}