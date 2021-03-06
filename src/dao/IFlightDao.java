package dao;

import java.util.Set;

public interface IFlightDao<Flight> {
    
    void insterFlight (Flight flight);
    Set<Flight> getAllFlights();
    Flight getFlightByDepartureTime(String departureTime);
    Flight getFlightByDeparturAirPort(String departurAirPort);
    Flight getFlightByDestinationAirPort(String destinationAirPort);
    void updateFlight(Flight flight);
}

