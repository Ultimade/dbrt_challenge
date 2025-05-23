package hu.ultimade.dbrt_challenge.services;

import hu.ultimade.dbrt_challenge.dto.RestResponse;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;

@SpringBootTest
class DateServiceTest {

    @Autowired
    private DateService dateService;

    @Test
    void getDayOfTheWeek_TestWithValidDate() {
        assertInstanceOf(RestResponse.class, dateService.getDayOfTheWeek(LocalDate.of(2025, 5, 23)));
        assertEquals("péntek", ((RestResponse)dateService.getDayOfTheWeek(LocalDate.of(2025, 5, 23))).getMsg());
    }
}