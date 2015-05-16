package ua.in.nvr.www;

import ua.in.nvr.www.vehicle.Vehicle;
import ua.in.nvr.www.vehicle.Car;

/**
 *
 * @author Yura
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Main main = new Main();
        main.run();
    }

    private void run() {
        //
        //
        /*      1
        Animal a = new Dog("Tuzik", "Ivanov");
        a.run(10);
        a.voice();

        //          2
        Animal b = new Dog();
        b.voice();


        Dog c = (Dog) a; // нисходящее приведение типа
        c.runByCat();
        ((Dog) a).runByCat(); // вызов с одновременным приведением типа
        */
        // cars

        Vehicle bmw = new Car("Petrov", "BE2205AA");
        bmw.run(100);
        bmw.stop();


        System.out.println(bmw.drivername);

    }
}
