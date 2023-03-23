package HW_14_03_2023;

public class Woman extends Human {

    public Woman(String name) {
        super(name);
    }

    @Override
    public void welcome() {
        System.out.println("Я родилась!");
    }

    @Override
    public String toString() {
        return "Женщина по имени: " + getName();
    }

}
