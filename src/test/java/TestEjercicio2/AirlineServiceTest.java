package TestEjercicio2;
import Ejercicio2.AirlineServiceUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockedStatic;
import org.mockito.Mockito;

public class AirlineServiceTest {

    @Test

    public void testBookingFlightWithAvailableTickets(){
         try
                 (MockedStatic<AirlineServiceUtils>utilities = Mockito.mockStatic(AirlineServiceUtils.class))
         {

             utilities.when(() -> AirlineServiceUtils.areTicketsAvailable("La Paz", 2)).thenReturn(true);
             utilities.when(() -> AirlineServiceUtils.getWeekday(29, 5, 2023)),thenReturn("Monday"  )


         }




    }




}
