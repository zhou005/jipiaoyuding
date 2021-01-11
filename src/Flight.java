public class Flight {
    private String id;
    private String planeTypoe; //飞机类型
    private String departurAirPort; //起飞地点
    private String destinationAirPort; //目的地
    private String departureTime; //时间
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPlaneTypoe() {
        return planeTypoe;
    }

    public void setPlaneTypoe(String planeTypoe) {
        this.planeTypoe = planeTypoe;
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
