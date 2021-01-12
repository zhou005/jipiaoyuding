package cn.edu.hcnu.bean;

public class Flight { //飞机信息
    
    private String id; //主键
    private String flightID; //飞机编号
    private String planeTypoe; //飞机类型
    private int currentSeatsNum; //航班总座位
    private String departurAirPort; //起飞机场
    private String destinationAirPort; //目的机场
    private String departureTime; //起飞时间


    public Flight(String id, String flightID, String planeTypoe, int currentSeatsNum, String departurAirPort, String destinationAirPort, String departureTime) {
        this.id = id;
        this.flightID = flightID;
        this.planeTypoe = planeTypoe;
        this.currentSeatsNum = currentSeatsNum;
        this.departurAirPort = departurAirPort;
        this.destinationAirPort = destinationAirPort;
        this.departureTime = departureTime;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "flightID=" + flightID +
                ", planeTypoe='" + planeTypoe + '\'' +
                ", currentSeatsNum=" + currentSeatsNum +
                ", departurAirPort='" + departurAirPort + '\'' +
                ", destinationAirPort='" + destinationAirPort + '\'' +
                ", departureTime='" + departureTime + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFlightID() {
        return flightID;
    }

    public void setFlightID(String flightID) {
        this.flightID = flightID;
    }

    public String getPlaneTypoe() {
        return planeTypoe;
    }

    public void setPlaneTypoe(String planeTypoe) {
        this.planeTypoe = planeTypoe;
    }

    public int getCurrentSeatsNum() {
        return currentSeatsNum;
    }

    public void setCurrentSeatsNum(int currentSeatsNum) {
        this.currentSeatsNum = currentSeatsNum;
    }

    public String getDeparturAirPort() {
        return departurAirPort;
    }

    public void setDeparturAirPort(String departurAirPort) {
        this.departurAirPort = departurAirPort;
    }

    public String getDestinationAirPort() {
        return destinationAirPort;
    }

    public void setDestinationAirPort(String destinationAirPort) {
        this.destinationAirPort = destinationAirPort;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }


}
