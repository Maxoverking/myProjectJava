package HW_17_03_2023;

public class Apartment extends House {

    private int entrance;

    public Apartment(String address, int entrance) {
        super(address);
        this.entrance = entrance;
    }

    @Override
    public String toString() {
        return "Многоквартирный дом по" + super.toString() + " подъезд № " + entrance;
    }

    @Override
    public void destroyHouse() {
        System.out.println("Вы снесли многоквартирный дом. C " + entrance + " подъездов!");
    }

}
