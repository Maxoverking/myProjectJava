package HW_14_03_2023;

public class Human {

    private String name;

    public Human(String name) {
        this.name = name;
    }

    public Human() {
    }

    public String getName() {
        return name;
    }

    public void welcome() {
        System.out.println("Я родился!");
    }

    @Override
    public String toString() {
        return "Человек по имени: " + name;
    }

    public char[] run() {
        return null;
    }
}
