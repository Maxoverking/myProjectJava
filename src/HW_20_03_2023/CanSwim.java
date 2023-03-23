package HW_20_03_2023;

public interface CanSwim {
    String swim = " умеет плавать";

    public default String swim() {
        return swim;
    }
}
