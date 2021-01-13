package cn.edu.hcnu.dao.impl;

import cn.edu.hcnu.bean.Flight;
import cn.edu.hcnu.dao.IFlightDao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Set;

public class FlightDaoIml implements IFlightDao {

    @Override
    public void insterFlight(Object o) {

    }


    public void insterFlight(Flight flight) throws SQLException, SQLException {
        String url = "jdbc:oracle:thin@localhost:1521:orcl";

        String username = "opts";
        String password = "opts1234";
        Connection coon = DriverManager.getConnection(url,username,password);
        String sql = "INSERT INTO flight VALUES(?,?,?,?,?,?,?)";

        PreparedStatement pstmt = coon.prepareStatement(sql);


        pstmt.setString(1, flight.getId());
        pstmt.setString(2, flight.getFlightID());
        pstmt.setString(3, flight.getPlaneTypoe());
        pstmt.setInt(4, flight.getCurrentSeatsNum());
        pstmt.setString(5, flight.getDeparturAirPort());
        pstmt.setString(6, flight.getDestinationAirPort());
        pstmt.setString(7, flight.getDepartureTime());

        pstmt.executeUpdate();
    }

    @Override
    public Set getAllFlights() {
        return null;
    }

    @Override
    public Object getFlightByDepartureTime(String departureTime) {
        return null;
    }

    @Override
    public Object getFlightByDeparturAirPort(String departurAirPort) {
        return null;
    }

    @Override
    public Object getFlightByDestinationAirPort(String destinationAirPort) {
        return null;
    }

    @Override
    public void updateFlight(Object o) {

    }
}