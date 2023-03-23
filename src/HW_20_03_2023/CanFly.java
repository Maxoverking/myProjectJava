package HW_20_03_2023;

public interface CanFly {
    String fly = " умеет летать";

    public default String fly() {
        return fly;
    };
}
