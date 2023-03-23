package HW_20_03_2023.AllCharacters;

import HW_20_03_2023.CanFly;
import HW_20_03_2023.CanRun;
import HW_20_03_2023.CanSwim;

public class Duck implements CanSwim, CanRun, CanFly {
    String DUCK = "Утка";

    @Override
    public String run() {
        return DUCK + CanRun.super.run();
    }

    @Override
    public String swim() {
        return DUCK + CanSwim.super.swim();
    }

    @Override
    public String fly() {
        return DUCK + CanFly.super.fly();
    }

}