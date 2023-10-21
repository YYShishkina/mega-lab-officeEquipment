import Models.Computer;
import Models.Laptop;
import Models.Tablet;

public class Main {
    public static void main(String[] args) {

        Laptop laptop = new Laptop("Laptop ID1", false);
        Computer computer = new Computer("Comp ID1", false);
        Tablet tablet = new Tablet("Tablet ID1", false);

        laptop.turnOn();
        laptop.turnOff();
        laptop.turnOff();
        laptop.turnOn();
        laptop.turnOn();
        laptop.turnOff();
        System.out.println();

        computer.turnOn();
        computer.turnOff();
        computer.turnOff();
        computer.turnOn();
        computer.turnOn();
        computer.turnOff();
        System.out.println();

        tablet.turnOn();
        tablet.turnOff();
        tablet.turnOff();
        tablet.turnOn();
        tablet.turnOn();
        tablet.turnOff();
        System.out.println();

    }
}
