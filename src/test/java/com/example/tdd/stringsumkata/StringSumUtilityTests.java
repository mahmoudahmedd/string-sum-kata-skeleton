package com.example.tdd.stringsumkata;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class StringSumUtilityTests {

    @Test
    public void addTwoStringsThatAreRealNumbers(){
         // Arrange
         String firstNumber = "100";
         String secondNumber = "60";

         // Act
         Long actualSum = StringSumUtility.addTwoNumbers(firstNumber, secondNumber);

         // Assert
        Long expectedSum = 160L;

        assertEquals(expectedSum, actualSum);

    }

}
