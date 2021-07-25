package com.bridgelabz.cabinvoice;

import java.util.*;

public class RideRepository
{
    Map<String, ArrayList<Ride>> userRides = null;

    public RideRepository() {
        this.userRides = new HashMap<>();
    }

    public void addRides(String userId, Ride[] rides) {
        this.userRides.put(userId, new ArrayList<>(Arrays.asList(rides)));
    }

    public Ride[] getRides(String userId) throws RideRepositoryException {
        if (userId != "")
            return this.userRides.get(userId).toArray(new Ride[0]);
        else
            throw new RideRepositoryException("Null value passed", RideRepositoryException.ExceptionType.NULL_VALUE);
    }
}
