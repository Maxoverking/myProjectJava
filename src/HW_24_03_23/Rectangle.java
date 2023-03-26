package HW_24_03_23;

public class Rectangle{
//    Задача 1
//    Создать класс Rectangle (прямоугольник), которому
//    в конструкторе нужно передавать длину и ширину.
//    Написать компаратор, который сравнивает прямоугольники по площади.
//    Написать тесты для этого компаратора.
    private int length;
    private int width;
public Rectangle(int length, int width){
    this.length = length;
    this.width = width;
}
public  int getRectangleArea(){
    return length * width;
}

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }
}

