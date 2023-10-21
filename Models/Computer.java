package Models;

public class Computer extends OfficeEquipment {

    boolean status = false;

    public Computer(String nameOfficeEquipment, boolean status) {
        this.status = status;
        this.nameOfficeEquipment = nameOfficeEquipment;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public boolean getStatus() {
        return status;
    }

    @Override
    public void turnOff() {
        this.status = status;
        if (status == false) {
            System.out.println("Computer " + getNameOfficeEquipment() + " already turnoff");
        } else {
            status = false;
            System.out.println("Computer " + getNameOfficeEquipment() + " turnoff");
        }
    }

    @Override
    public void turnOn() {
        this.status = status;
        if (status == false) {
            System.out.println("Computer " + getNameOfficeEquipment() + " turnOn");
            status = true;
        } else {
            System.out.println("Computer " + getNameOfficeEquipment() + " already turnOn");
        }

    }
}
