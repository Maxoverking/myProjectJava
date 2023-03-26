package HW_20_03_2023.AllCharacters;

import HW_20_03_2023.CanFly;
import HW_20_03_2023.CanRun;
import HW_20_03_2023.CanSwim;

public class Superman implements CanFly, CanRun, CanSwim {
    final String SUPERMAN = "Супермен";

    @Override
    public String swim() {
        return SUPERMAN + CanSwim.super.swim();
    }

    @Override
    public String run() {
        return SUPERMAN + CanRun.super.run();
    }

    @Override
    public String fly() {
        return SUPERMAN + CanFly.super.fly();
    }
}
