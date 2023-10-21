package Models;

public class Tablet extends OfficeEquipment{

    boolean status = false;

    public Tablet (String nameOfficeEquipment, boolean status) {
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
            System.out.println("Tablet " + getNameOfficeEquipment() + " already turnoff");
        } else {
            status = false;
            System.out.println("Tablet " + getNameOfficeEquipment() + " turnoff");
        }
    }

    @Override
    public void turnOn() {
        this.status = status;
        if (status == false) {
            System.out.println("Tablet " + getNameOfficeEquipment() + " turnOn");
            status = true;
        } else {
            System.out.println("Tablet " + getNameOfficeEquipment() + " already turnOn");
        }

    }
}


