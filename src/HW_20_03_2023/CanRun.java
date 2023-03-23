package HW_20_03_2023;

public interface CanRun {
    String run = " умеет бегать";

    public default String run() {
        return run;
    };
}