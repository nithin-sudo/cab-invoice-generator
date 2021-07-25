package com.bridgelabz.cabinvoice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class InvoiceServiceTest {
    InvoiceGenerator cabInvoiceGenerator = null;
    @BeforeEach
    public void setup() throws Exception
    {
        cabInvoiceGenerator = new InvoiceGenerator();
    }
    @Test
    public void whenGivenDistanceAndTimeShouldReturnTotalFare() {
        double distance = 2.0;
        int time = 5;
        double totalFare = cabInvoiceGenerator.calculateFare(distance, time);
        System.out.println("Total Fare = " + totalFare);
        Assertions.assertEquals(25, totalFare, 0.0);
    }
    @Test
    public void whenGivenDistanceAndTimeShouldReturnMinimumFare() {
        double distance = 0.1;
        int time = 1;
        double totalFare = cabInvoiceGenerator.calculateFare(distance, time);
        System.out.println("Total Fare = " + totalFare);
        Assertions.assertEquals(5, totalFare, 0.0);
    }
    @Test
    public void givenMultipleRidesShouldReturnInvoiceSummary() {
            Ride[] rides = {
                    new Ride(2.0, 5),
                    new Ride(0.1, 1)};
            InvoiceSummary summary = cabInvoiceGenerator.calculateFare(rides);
            InvoiceSummary expectedInvoiceSummary = new InvoiceSummary(2, 30.0);
            Assertions.assertEquals(expectedInvoiceSummary, summary);
    }
}