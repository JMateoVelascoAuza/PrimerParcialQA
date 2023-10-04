package TestEjercicio2;
import Ejercicio2.AirlineServiceUtils;
import Ejercicio3.AirlineService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockedStatic;
import org.mockito.Mockito;

public class AirlineServiceTest {

    @Test

    public void testBookingFlightWithAvailableTickets() {
        try
                (MockedStatic<AirlineServiceUtils> utilities = Mockito.mockStatic(AirlineServiceUtils.class)) {

            utilities.when(() -> AirlineServiceUtils.areTicketsAvailable("La Paz", 2)).thenReturn(true);
            utilities.when(() -> AirlineServiceUtils.getWeekday(29, 5, 2023)).thenReturn("Monday");

            AirlineService airlineService = new AirlineService();
            String response = airlineService.bookFlight("La Paz", 2, 29, 5, 2023);
            Assertions.assertEquals("On Monday 29 May 2023, thre are 2 tickets available for La Paz", response);

        }
    }


            @Test
    public void  testBookFlightWithoutAvailableTickets(){


        try (MockedStatic<AirlineServiceUtils>utilities = Mockito.mockStatic(AirlineServiceUtils.class)){

            utilities.when(() -> AirlineServiceUtils.areTicketsAvailable("La Paz", 3)).thenReturn(false);
            AirlineService airlineService = new AirlineService();
            String response = airlineService.bookFlight("La Paz", 3, 29, 5, 2023);

            Assertions.assertEquals("There are not enough tickets available for La Paz", response);

        }


         }

@Test
public void testBookFlightOnSunday(){


    try (MockedStatic<AirlineServiceUtils>utilities = Mockito.mockStatic(AirlineServiceUtils.class)){

        utilities.when(() -> AirlineServiceUtils.areTicketsAvailable("La Paz", 2)).thenReturn(true);
       AirlineService airlineService = new AirlineService();
        String response = airlineService.bookFlight("La Paz", 3, 29, 5, 2023);

        Assertions.assertEquals("There are not enough tickets available for La Paz", response);

    }


}





}
