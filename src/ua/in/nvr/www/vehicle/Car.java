package ua.in.nvr.www.vehicle;

/**
 * Created by Олеся on 16.05.2015.
 */
public class Car extends Vehicle {
    public Car(String drivername, String nomerkuzova){
        super(drivername,nomerkuzova);
    }


    public Car(){
    }

    public Car(String drivername){
        this(drivername,"n/a");
    }

    @Override
    public String PersonalABS(){
        return " Max(5) stop";
    }

}
