package gr.athtech.ioo;

public class Main {

    public static void main(String[] args) {
    Flight f1 = new Flight();
    f1.setdepAirport("Athens");
    Time t1 = new Time();
   // t1.setHour(10);
   // t1.setMin(20);
   // t1.setSec(35);
    t1.setTime(10,20,35);

    f1.setDepTime(t1);
    f1.setArAirport("California");
    Time t2 = new Time();
    t2.setTime(12,6,00);
    f1.setArTime(t2);
    System.out.println(f1);

    Time t3 = new Time();
    t3.setTime(1,2,3);
    System.out.println(t3);

    }

}
