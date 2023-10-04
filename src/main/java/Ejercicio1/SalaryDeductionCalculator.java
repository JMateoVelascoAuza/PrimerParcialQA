package Ejercicio1;

public class SalaryDeductionCalculator {
     private static final int STANDARD_SALARY = 2000;

     public double calculateDeduction(double salary) {
         if (salary <= 0) {
             throw new
                     IllegalArgumentException("Invalid Salary Amount");
         }

         if (salary <= STANDARD_SALARY) {
             return 0.0;
         } else if (salary > STANDARD_SALARY && salary <= 2 * STANDARD_SALARY) {
             return 5.0;
         }else{
             return 15.0;


         }



         }

         }









