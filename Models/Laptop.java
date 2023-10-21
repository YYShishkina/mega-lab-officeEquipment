package Models;

public class Laptop extends OfficeEquipment{
    boolean status = false;

    public Laptop (String nameOfficeEquipment, boolean status){
        this.status=status;
        this.nameOfficeEquipment=nameOfficeEquipment;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public boolean getStatus(){
        return status;
    }

    @Override
    public void turnOff() {
        this.status = status;
        if (status == false){
            System.out.println("Laptop "+ getNameOfficeEquipment()+" already turnoff");
        }
        else {
            status = false;
            System.out.println("Laptop "+ getNameOfficeEquipment()+" turnoff");
        }
    }

    @Override
    public void turnOn() {
        this.status = status;
        if (status == false){
            System.out.println("Laptop "+ getNameOfficeEquipment()+" turnOn");
            status = true;
        }
        else {
            System.out.println("Laptop "+ getNameOfficeEquipment()+" already turnOn");
        }

    }
}

