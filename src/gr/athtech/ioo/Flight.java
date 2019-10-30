package gr.athtech.ioo;

public class Flight {
    private String arAirport;
    private String depAirport;

    public void setArAirport(String ArAirport) {
        this.arAirport = arAirport;
    }

    public String getarAirport(String ArAirport) {
        return arAirport;
    }

    public void setdepAirport(String depAirport) {
        this.depAirport = depAirport;
    }
    public String getdepAirport(String depAirport) {
        return depAirport;
    }
    public String toString(){
        return depAirport + ","+ arAirport;
    }












}