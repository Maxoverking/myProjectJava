package HW_14_03_2023;

// Создайте класс"Человек",конструктор которого принимает имя.
// При попытке вывести объект этого класса на экран должна выводиться строка"Человек по имени ...".
// Добавьте в класс"Человек"метод"приветствие",который будет выводить строку:"Я родился!"
// Создайте классы"Мужчина"и"Женщина",которые будут наследниками класса"Человек".
// Попытка вывести их на экран должна приводить к выводу строки"Мужчина по имени ..."или"Женщина по имени ..."
// Метод"приветствие"класса"Женщина"должен выводить строку:"Я родилась!"

public class Main {
    public static void main(String[] args) {

        Human human = new Human("Jim");
        System.out.println(human);
        human.welcome();

        Human man = new Man("Tom");
        System.out.println(man);
        man.welcome();

        Human woman = new Woman("Anna");
        System.out.println(woman);
        woman.welcome();

    }

}
