package TestEjercicio1;
import Ejercicio1.SalaryDeductionCalculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.mockito.CheckReturnValue;


public class SalaryDeductionCalculatorTest {

    private SalaryDeductionCalculator salaryDeductionCalculator = new SalaryDeductionCalculator();



    @ParameterizedTest
    @CsvSource({
            "2000, 0.0",
            "2000,01, 5.0",
            "1999.9, 0.0",
            "4000,1, 15.0",
            "3999,99, 5.0",
            "1000, 0.0",
            "3000, 15.0",
            "2500, 15.0",
            "-1000, 15.0",
            "-500, 0.0"

    })

    public void shouldCalculateDeductionAccurately(double salary, double expectedDeduction)
    {
        if (salary < 0) {
            Assertions.assertThrows(IllegalArgumentException.class, () -> salaryDeductionCalculator.calculateDeduction(salary));
        }else {
            double actualDeduction = salaryDeductionCalculator.calculateDeduction(salary);

            Assertions.assertEquals(expectedDeduction, actualDeduction, "Mismatch in expected dedcution");
        }


    }






}
