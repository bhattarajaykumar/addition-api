package org.eficens.service;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AdditionServiceTest {

    private AdditionService additionService;

    @BeforeEach
    public void setUp() {
        additionService = new AdditionService();
    }

    @Test
    public void testPerformAdditionPositive() {
        int number1 = 5;
        int number2 = 10;
        int expectedSum = 15;

        int result = additionService.add(number1, number2);

        Assertions.assertEquals(expectedSum, result);
    }

    @Test
    public void testPerformAdditionNegative() {
        int number1 = 5;
        int number2 = 10;
        int notExpectedSum = 12;

        int result = additionService.add(number1, number2);

        Assertions.assertNotEquals(notExpectedSum, result);
    }

}
