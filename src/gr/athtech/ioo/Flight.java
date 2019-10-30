package gr.athtech.ioo;

public class Flight {
    private String arAirport;
    private String depAirport;
    private Time depTime;
    private Time arTime;

    public void setArAirport(String arAirport) {
        this.arAirport = arAirport;
    }

    public String getarAirport() {
        return arAirport;
    }

    public void setdepAirport(String depAirport) {
        this.depAirport = depAirport;
    }
    public String getdepAirport() {
        return depAirport;
    }

    public Time getDepTime() {
        return depTime;
    }

    public void setDepTime(Time depTime) {
        this.depTime = depTime;
    }

    public Time getArTime() {
        return arTime;
    }

    public void setArTime(Time arTime) {
        this.arTime = arTime;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "arAirport='" + arAirport + '\'' +
                ", depAirport='" + depAirport + '\'' +
                ", depTime=" + depTime +
                ", arTime=" + arTime +
                '}';
    }
}