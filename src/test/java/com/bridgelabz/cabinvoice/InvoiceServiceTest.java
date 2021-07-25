package com.bridgelabz.cabinvoice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class InvoiceServiceTest {
    @Test
    public void whenGivenDistanceAndTimeShouldReturnTotalFare() {
        InvoiceGenerator cabInvoiceGenerator = new InvoiceGenerator();
        double distance = 2.0;
        int time = 5;
        double totalFare = cabInvoiceGenerator.calculateFare(distance, time);
        System.out.println("Total Fare = " + totalFare);
        Assertions.assertEquals(25, totalFare, 0.0);
    }
}