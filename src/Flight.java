public class Flight { //飞机信息
    
    private String id;
    private String planeTypoe; //飞机类型
    private String seatsnumber; // 座位号
    private String totalseatsnum; //航班总座位
    private String departurAirPort; //起飞地点
    private String destinationAirPort; //目的地
    private String departureTime; //耗费时间
    
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

    public String getSeatsnumber() {
        return seatsnumber;
    }

    public void setSeatsnumber(String seatsnumber) {
        this.seatsnumber = seatsnumber;
    }

    public String getTotalseatsnum() {
        return totalseatsnum;
    }

    public void setTotalseatsnum(String totalseatsnum) {
        this.totalseatsnum = totalseatsnum;
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
