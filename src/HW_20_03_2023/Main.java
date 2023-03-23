package HW_20_03_2023;

import HW_20_03_2023.AllCharacters.Airplane;
import HW_20_03_2023.AllCharacters.Duck;
import HW_20_03_2023.AllCharacters.Human;
import HW_20_03_2023.AllCharacters.Penguin;
import HW_20_03_2023.AllCharacters.Superman;
// Задача 1
// Напишите интерфейсы "Умеет летать" CanFly с методом fly(), 
// "Умеет бегать"CanRun с методом run и"умеет плавать"CanSwim 
// с методом swim и реализуйте их в классе "Супермен" Superman.

// Задача 2
// Реализуйте соответствующие интерфейсы из предыдущей задачи 
// в классах "Человек", "Утка", "Пингвин" и "Самолёт".

public class Main {
    public static void main(String[] args) {
        // Так
        // Superman superman = new Superman();
        // Human man = new Human();
        // Duck duck = new Duck();
        // Penguin penguin = new Penguin();
        // Airplane airplane = new Airplane();
        // Или так
        System.out.println(new Superman().fly());
        System.out.println(new Human().run());
        System.out.println(new Duck().fly());
        System.out.println(new Duck().run());
        System.out.println(new Duck().swim());
        System.out.println(new Penguin().swim());
        System.out.println(new Airplane().fly());

    }
}
