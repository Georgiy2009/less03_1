package ua.in.nvr.www.vehicle;

/**
 * Created by Олеся on 16.05.2015.
 */
public abstract class Vehicle {
    String drivername;
    String nomerkuzova;
    Integer  maxspeed;

    public Vehicle(){
        this("Vehical", ""); // Вызов другого конструктора этого же класса с 2-мя стрингами
        System.out.println("объект создан - без параметров");
    }


    public Vehicle(String drivername){
        this.drivername=drivername;

    }

    public Vehicle(String drivername,String nomerkuzova){
        this.drivername=drivername;
        this.nomerkuzova=nomerkuzova;
        System.out.println("abstract class Vehicle 2 параметра");
    }

    public Vehicle(String drivername,String nomerkuzova,Integer maxspeed){
        this.drivername=drivername;
        this.nomerkuzova=nomerkuzova;
        this.maxspeed=maxspeed;
        System.out.println("abstract class Vehicle 3 параметра");
    }

    // tofuel zapravka
    public void tofuel(int gas){
        System.out.println("abstract class Vehicle To fuel marka " + gas);
    }

    public void run(int speed){
        System.out.println("abstract class Vehicle Running with " + speed);
    }

    public void stop(){
        System.out.println("abstract class Vehicle Stop with " + PersonalABS());
    }



    public abstract String PersonalABS();
}