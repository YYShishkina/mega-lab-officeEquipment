package Models;

// Создайте класс OfficeEquipment.
// У класса есть поле name и методы turnOff() и turnOn()
// c выводом на кослось о том что техника ключилась или выключилась
// Создайте классы Laptop, Computer, Tablet.
// В этих классах переопределите методы turnOff() и turnOn().
// Также как правило добавтье все необходимое для того что бы классы были полностью рабочие

public abstract class OfficeEquipment {

    String nameOfficeEquipment;

    public String getNameOfficeEquipment() {
        return nameOfficeEquipment;
    }

    public void setNameOfficeEquipment(String nameOfficeEquipment) {
        this.nameOfficeEquipment = nameOfficeEquipment;
    }

    public abstract void turnOff();
    public abstract void turnOn();

}
