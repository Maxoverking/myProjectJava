package HW_20_03_2023.AllCharacters;

import HW_20_03_2023.CanFly;

public class Airplane implements CanFly {
    final String AIRPLANE = "Самолет";

    @Override
    public String fly() {
        return AIRPLANE + CanFly.super.fly();
    }
}
