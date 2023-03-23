package HW_17_03_2023;

public abstract class House {

    private String address;

    public House(String address) {
        this.address = address;

    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return " aдресу " + address;
    }

    public abstract void destroyHouse();

}
