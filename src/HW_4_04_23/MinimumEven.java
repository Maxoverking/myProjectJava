package HW_4_04_23;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MinimumEven  {
//  Найти минимальное чётное число в последовательности положительных
//  чисел или вывести -1, если такого числа не существует.
//  Оценить временную и пространственную сложность алгоритма.
public static void main(String[] args) throws IOException {
  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  System.out.print("Количество чисел : ");
  int n = Integer.parseInt(br.readLine());
  int minEven = Integer.MAX_VALUE;
  int i = 0;
  while (i < n) {
    int x = Integer.parseInt(br.readLine());
    if (x % 2 == 0 && x < minEven) {
      minEven = x;
    }
    i++;
  }
  if (minEven == Integer.MAX_VALUE){
    System.out.println("-1");
  }else {
  System.out.println(minEven);
  }
}
// Не могу оценить времменую и пространственную сложность
// эта тема очень туго идет и наверное я из тех 95 %
// которые никогда не будут это использовать
}
