package HW_20_03_2023.AllCharacters;

import HW_20_03_2023.CanFly;
import HW_20_03_2023.CanRun;
import HW_20_03_2023.CanSwim;

public class Penguin implements CanSwim, CanRun, CanFly {
    final String PENGUIN = "Пингвин";

    @Override
    public String run() {
        return PENGUIN + CanRun.super.run();
    }

    @Override
    public String swim() {
        return PENGUIN + CanSwim.super.swim();
    }
}