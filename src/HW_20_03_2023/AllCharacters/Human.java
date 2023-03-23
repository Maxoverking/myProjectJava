package HW_20_03_2023.AllCharacters;

import HW_20_03_2023.CanRun;
import HW_20_03_2023.CanSwim;

public class Human implements CanSwim, CanRun {
    String PERSON = "Человек";

    @Override
    public String run() {
        return PERSON + CanRun.super.run();
    }

    @Override
    public String swim() {
        return PERSON + CanSwim.super.swim();
    }

}
