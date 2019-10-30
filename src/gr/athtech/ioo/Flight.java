package gr.athtech.ioo;

public class Flight {
    private String arAirport;
    private String depAirport;

    public void setArAirport(String ArAirport) {
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
    public String toString(){
        return depAirport + ","+ arAirport;
    }












}