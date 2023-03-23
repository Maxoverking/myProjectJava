package HW_17_03_2023;

public class PrivateHouse extends House {

    public PrivateHouse(String address) {
        super(address);
    }

    @Override
    public String toString() {
        return "Частный дом по" + super.toString();
    }

    @Override
    public void destroyHouse() {
        System.out.println("Вы снесли частный дом");
    }
}
