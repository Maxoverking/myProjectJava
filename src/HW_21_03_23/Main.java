package HW_21_03_23;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Задача 1
// Создайте класс Book (книга), в конструктор которого 
// передавайте автора, название книги и количество страниц.
// Реализуйте интерфейс для сравнения книг:
// они должны сортироваться по авторам, 
// а если авторы совпадают - по названиям 
// (и там, и там - по алфавиту, "в словарном порядке").
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите количество книг: ");
        int n = Integer.parseInt(br.readLine());

        List<Book> bookLists = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            bookLists.add(Book.bookInformation());
        }
        Collections.sort(bookLists);
        for (Book book : bookLists) {
            System.out.println("book: " + book);
        }

    }
}
