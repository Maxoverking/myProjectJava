package HW_12_04_23;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Task2IndexOf {
//  Перепишите алгоритм бинарного поиска элемента в отсортированном
//  по возрастанию списке целых чисел
//      (см. урок 56, задача 2) с использованием рекурсии.
  public static int binarySearch(ArrayList<Integer> numbers, int target, int left, int right) {
    if (left > right) {
      return -1;
    }
    int mid = (left + right) / 2;
    if (numbers.get(mid) == target) {
      return mid;
    }
    if (numbers.get(mid) < target) {
      return binarySearch(numbers, target, mid + 1, right);
    } else {
      return binarySearch(numbers, target, left, mid - 1);
    }
  }

  public static int indexOf(ArrayList<Integer> numbers, int target) {
    return binarySearch(numbers, target, 0, numbers.size() - 1);
  }

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.print("Введите количество элементов: ");
    int n = Integer.parseInt(br.readLine());

    ArrayList<Integer> numbers = new ArrayList<>(n);
    for (int i = 0; i < n; ++i) {
      numbers.add(Integer.parseInt(br.readLine()));
    }

    System.out.print("Введите число для поиска: ");
    int target = Integer.parseInt(br.readLine());

    System.out.println("Нужное число под индексом : " + indexOf(numbers, target));
  }
}
