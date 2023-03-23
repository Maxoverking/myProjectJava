package HWFood;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Drink extends Food {

    private boolean soda;
    private boolean alcohol;

    public Drink(String meal, int calories, boolean soda, boolean alcohol) {
        super(meal, calories);
        this.soda = soda;
        this.alcohol = alcohol;
    }

    public boolean isSoda() {
        return soda;
    }

    public boolean isAlcohol() {
        return alcohol;
    }

    public void open() {
        if (alcohol) {
            int age = checkAge();
            if (age < 18) {
                System.out.println(" Вам еще рано пить алкоголь");
                return;
            }
        }
        String drinkSound = soda ? "Пшш..." : " Скр...";
        System.out.println(" Звук открывания напитка : " + drinkSound);

    }

    private int checkAge() {
        int age = 0;
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print(" Можно ли вам алкоголь? Ваш возраст : ");
            age = Integer.parseInt(br.readLine());
        } catch (NumberFormatException | IOException e) {
            e.printStackTrace();
        }
        return age;
    }

}
